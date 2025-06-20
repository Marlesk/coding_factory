package gr.aueb.cf.ch16.exercises.exercise_2;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (width + height));
    }
}
