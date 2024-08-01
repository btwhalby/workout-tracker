package dev.halby.workout_tracker.Exercise;

import dev.halby.workout_tracker.ExerciseGroup.ExerciseGroup;
import jakarta.persistence.*;

@Entity
@Table
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exerciseId;
    private String name;
    private String category;

    public Exercise(int exerciseId, String name, String description, String category) {
        this.exerciseId = exerciseId;
        this.name = name;
        this.category = category;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String exerciseGroup) {
        this.category = exerciseGroup;
    }

    public Exercise() {
    }
}
