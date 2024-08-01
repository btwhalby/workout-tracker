package dev.halby.workout_tracker.Sets;

import dev.halby.workout_tracker.WorkoutExercise.WorkoutExercise;
import jakarta.persistence.*;

@Entity
@Table
public class Sets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int setId;
    @ManyToOne
    @JoinColumn(name = "workout_exercise_id")
    private WorkoutExercise workout_exercise_id;
    private int set_number;
    private int repetitions;
    private float weight;
}
