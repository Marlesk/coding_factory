package gr.aueb.cf.ch16.exercises.exercise_1;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
