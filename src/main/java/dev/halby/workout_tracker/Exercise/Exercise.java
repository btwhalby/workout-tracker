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
    private String description;
    private ExerciseGroup exerciseGroup;

    public Exercise(int exerciseId, String name, String description, ExerciseGroup exerciseGroup) {
        this.exerciseId = exerciseId;
        this.name = name;
        this.description = description;
        this.exerciseGroup = exerciseGroup;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExerciseGroup getExerciseGroup() {
        return exerciseGroup;
    }

    public void setExerciseGroup(ExerciseGroup exerciseGroup) {
        this.exerciseGroup = exerciseGroup;
    }

    public Exercise() {
    }
}
