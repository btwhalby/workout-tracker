package dev.halby.workout_tracker.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    public List<Exercise> getAllExercieses() {
        return exerciseRepository.findAll();
    }
}
