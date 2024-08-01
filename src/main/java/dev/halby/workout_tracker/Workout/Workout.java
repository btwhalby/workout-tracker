package dev.halby.workout_tracker.Workout;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutId;
    private LocalDate workoutDate;
    private String description;

    public Workout() {

    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public LocalDate getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(LocalDate date) {
        this.workoutDate = date;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Workout(int workoutId, LocalDate workoutDate, String description) {
        this.workoutId = workoutId;
        this.workoutDate = workoutDate;
        this.description = description;
    }

}
