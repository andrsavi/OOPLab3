package po83.savinov.oop.model;

public class Aerobics extends AbstractExercise implements Exercise {
    private int duration;
    public static final int dur = 3;

    public Aerobics(String name, Equipments equipments, Approach[] approaches) {
        super(name, equipments);
        new WeightTraining(name, approaches);
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }
}
