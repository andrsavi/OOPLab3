package po83.savinov.oop.model;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        lab3test();
    }

    public static void lab3test() {
        Approach approach = new Approach();
        Approach approach1 = new Approach(1, 1.0D, 1);
        Approach approach2 = new Approach(2, 2.0D, 2);
        Approach approach10 = new Approach(10, 10.0D, 10);
        Approach[] approaches = new Approach[]{approach, approach1, approach2, approach10};
        Workout workout = new Workout(5);
        Exercise exercise1 = new Aerobics("Присед", Equipments.NONE, approaches);
        Exercise exercise2 = new Aerobics("Становая", Equipments.BURBELL, approaches);
        Exercise exercise3 = new Aerobics("Жим", Equipments.BURBELL, approaches);
        Exercise exercise4 = new Aerobics("Подтягивания", Equipments.NONE, approaches);
        Exercise exercise5 = new Aerobics("Отжимания", Equipments.NONE, approaches);
        workout.addExercise(exercise1);
        workout.addExercise(exercise2);
        workout.addExercise(exercise3);
        workout.addExercise(exercise4);
        workout.addExercise(exercise5);
        Exercise[] exercises = workout.getWithoutEquipment();

        for(int i = 0; i < exercises.length; ++i) {
            System.out.println(exercises[i].getName());
        }

    }
}
