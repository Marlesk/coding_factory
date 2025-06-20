package gr.aueb.cf.ch15.exercises;

public class Dog extends Animal {
    private String dog;

    public Dog() {

    }

    public Dog(int age, String name, String dog) {
        super(age, name);
        this.dog = dog;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return super.toString() + "," + "dog = " + dog;
    }
}
