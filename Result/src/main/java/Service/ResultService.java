package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Result;
import repository.ResultRepository;

@Service
public class ResultService {
    private static final int PASSING_MARKS = 40;
    
    @Autowired
    private ResultRepository resultRepository;

    public Result calculateAndSaveResult(Result result) {
        double average = calculateAverage(result);
        result.setAverage(average);
        result.setStatus(determineStatus(result));
        return resultRepository.save(result);
    }

    public Result getResult(String rollNumber) {
        return resultRepository.findById(rollNumber)
            .orElseThrow(() -> new RuntimeException("Result not found"));
    }

    private double calculateAverage(Result result) {
        return (result.getMathematicsMarks() + 
                result.getEnglishMarks() + 
                result.getScienceMarks()) / 3.0;
    }

    private String determineStatus(Result result) {
        if (result.getMathematicsMarks() < PASSING_MARKS ||
            result.getEnglishMarks() < PASSING_MARKS ||
            result.getScienceMarks() < PASSING_MARKS) {
            return "FAIL";
        }
        return "PASS";
    }
}