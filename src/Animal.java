import java.sql.SQLOutput;

public class Animal {

    int age;
    String name;

    public Animal(){
    }

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Hello, I am an animal.");
    }

    public void eat(){
        System.out.println("Munch munch");
    }

    @Override
    public String toString() {
        return "age=" + this.age + ", name='" + this.name +"'";
    }

}
