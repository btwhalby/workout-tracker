package dev.halby.workout_tracker.WorkoutExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutExerciseService {
    @Autowired
    WorkoutExerciseRepository workoutExerciseRepository;

    public List<WorkoutExercise> getAllWorkoutExercises() {
        return workoutExerciseRepository.findAll();
    }
}
