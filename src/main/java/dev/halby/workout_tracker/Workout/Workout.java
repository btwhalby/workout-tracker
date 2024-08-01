package dev.halby.workout_tracker.Workout;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutId;
    private LocalDate date;
    private String description;

    public Workout() {

    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Workout(int workoutId, LocalDate date, String description) {
        this.workoutId = workoutId;
        this.date = date;
        this.description = description;
    }
}
