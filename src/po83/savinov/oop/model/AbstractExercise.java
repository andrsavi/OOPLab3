package po83.savinov.oop.model;

public abstract class AbstractExercise implements Exercise {
    private String name;
    private Equipments equipments;

    public AbstractExercise() {
        this.name = "";
        this.equipments = Equipments.NONE;
    }

    public AbstractExercise(String name, Equipments equipments) {
        this.name = name;
        this.equipments = equipments;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipments getEquipments() {
        return this.equipments;
    }

    public void setEquipments(Equipments equipments) {
        this.equipments = equipments;
    }
}
