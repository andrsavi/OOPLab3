package po83.savinov.oop.model;

public class Approach {
    private int duration;
    private double weight;
    private int numOfRepetitions;

    public Approach() {
        this.weight = 0.0D;
        this.duration = 2;
        this.numOfRepetitions = 12;
    }

    public Approach(int duration, double weight, int numOfRepetitions) {
        this.duration = duration;
        this.weight = weight;
        this.numOfRepetitions = numOfRepetitions;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumOfRepetitions() {
        return this.numOfRepetitions;
    }

    public void setNumOfRepetitions(int numOfRepetitions) {
        this.numOfRepetitions = numOfRepetitions;
    }
}
