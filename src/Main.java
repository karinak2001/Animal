public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(3, "George", "Purina One");
        cat.makeNoise();
        cat.eat();

        System.out.println(cat);
        //System.out.println(cat.toString());
    }
}