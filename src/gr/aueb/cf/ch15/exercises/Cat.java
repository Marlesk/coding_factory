package gr.aueb.cf.ch15.exercises;

public class Cat extends Animal {
    private String cat;

    public Cat() {

    }

    public Cat(int age, String name, String cat) {
        super(age, name);
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return super.toString() + "," + "cat =" + cat;
    }
}
