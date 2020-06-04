package po83.savinov.oop.model;

public interface ComplexExercise extends Exercise {
    boolean add(Approach var1);

    Approach remove();

    Approach approach();

    boolean add(int var1, Approach var2);

    Approach getApproach(int var1);

    void setApproach(int var1, Approach var2);

    Approach remove(int var1);

    int size();

    Approach[] getApproaches();

    double[] approachWeights();

    int[] approachRepetitions();

    Approach remove(Approach var1);
}
