package po83.savinov.oop.model;

public class Workout {
    private Exercise[] exercises;
    private int size;
    private int total;

    public Workout() {
        this.size = 16;
        this.exercises = new Exercise[this.size];
    }

    public Workout(int empty) {
        this.exercises = new Exercise[empty];
        this.size = empty;
    }

    public Workout(Exercise[] exercises) {
        this.exercises = new Exercise[exercises.length];
        System.arraycopy(exercises, 0, this.exercises, 0, exercises.length);
        this.size = exercises.length;
    }

    public boolean addExercise(Exercise exercise) {
        if (this.size == 0) {
            return false;
        } else {
            for(int i = 0; i < this.exercises.length; ++i) {
                if (this.exercises[i] == null) {
                    this.exercises[i] = exercise;
                    --this.size;
                    break;
                }
            }

            return true;
        }
    }

    public boolean addExerciseInto(Exercise exercise, int pos) {
        if (this.size != 0 && pos < this.exercises.length && pos >= 0) {
            System.arraycopy(this.exercises, pos, this.exercises, pos + 1, this.exercises.length - pos);
            --this.size;
            return true;
        } else {
            return false;
        }
    }

    public Exercise getExercise(int pos) {
        return pos >= 0 && pos < this.exercises.length ? this.exercises[pos] : null;
    }

    public Exercise replaceExercise(Exercise exercise, int pos) {
        if (pos >= 0 && pos <= this.exercises.length) {
            Exercise temp = this.exercises[pos];
            if (temp == null) {
                --this.size;
            }

            this.exercises[pos] = exercise;
            return temp;
        } else {
            return null;
        }
    }

    public Exercise removeExerciseAt(int pos) {
        if (pos >= 0 && pos <= this.exercises.length) {
            Exercise temp = this.exercises[pos];
            this.exercises[pos] = null;
            ++this.size;
            return temp;
        } else {
            return null;
        }
    }

    public int getExerciseCount() {
        return this.total;
    }

    public int durationTotal() {
        int result = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.exercises[i] != null) {
                result += this.exercises[i].getDuration();
            }
        }

        return result;
    }

    public boolean hasExercise(String exerciseName) {
        for(int i = 0; i < this.size; ++i) {
            if (this.exercises[i] != null && this.exercises[i].getName().equals(exerciseName)) {
                return true;
            }
        }

        return false;
    }

    public int removeAll(String exerciseName) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.exercises[i] != null && this.exercises[i].getName().equals(exerciseName)) {
                Exercise var10000 = this.exercises[i];
                --this.total;

                for(int j = i + 1; j < this.size; ++j) {
                    this.exercises[j - 1] = this.exercises[j];
                }

                this.exercises[this.size - 1] = null;
            }

            ++count;
        }

        return count;
    }

    public Exercise[] getWithoutEquipment() {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.exercises[i].getEquipments().equals(Equipments.NONE)) {
                ++count;
            }
        }

        Exercise[] exercises = new Exercise[count];
        int j = 0;

        for(int i = 0; i < this.size; ++i) {
            if (exercises[i].getEquipments().equals(Equipments.NONE)) {
                exercises[j] = exercises[i];
                ++j;
            }
        }

        return exercises;
    }
}
