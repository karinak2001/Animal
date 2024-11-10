public class Cat extends Animal{
    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference){
        super(age, name);
        this.catFoodPreference = catFoodPreference;
        // אם נשתמש במילה super נוכל לקרוא לבנאי של מחלקת האב מהבנאי של מחלקת הבן
    }
    @Override
    public void makeNoise(){
        super.makeNoise(); //ידפיס את המתודה של מחלקת האב האורגינל
        System.out.println("Meow meow meow!");
    }

    @Override
    public String toString(){
        return super.toString() + ", '" + this.catFoodPreference + "'";
    }
}
