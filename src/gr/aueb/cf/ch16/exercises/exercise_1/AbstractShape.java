package gr.aueb.cf.ch16.exercises.exercise_1;

public class AbstractShape implements IShape {
    private long id;

    @Override
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
