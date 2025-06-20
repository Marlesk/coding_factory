package gr.aueb.cf.ch15.exercises;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(2,"Bob","Corgi");
        Cat cat = new Cat(5,"Gatoulis","Angira");

        doSpeak(dog);
        doSpeak(cat);

        System.out.println(dog.toString());
        System.out.println(cat.toString());

    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
