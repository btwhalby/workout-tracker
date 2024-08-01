package dev.halby.workout_tracker.WorkoutExercise;

import dev.halby.workout_tracker.Exercise.Exercise;
import dev.halby.workout_tracker.Workout.Workout;
import jakarta.persistence.*;

@Entity
@Table
public class WorkoutExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutExerciseId;
    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @Column(name = "exercise_order")
    private int order;

    public int getWorkoutExerciseId() {
        return workoutExerciseId;
    }

    public void setWorkoutExerciseId(int workoutExerciseId) {
        this.workoutExerciseId = workoutExerciseId;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public WorkoutExercise(int workoutExerciseId, Workout workout, Exercise exercise, int order) {
        this.workoutExerciseId = workoutExerciseId;
        this.workout = workout;
        this.exercise = exercise;
        this.order = order;
    }

    public WorkoutExercise() {
    }
}
