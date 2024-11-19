package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import controller.StudentRepository;
import model.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private RestTemplate restTemplate;

    public Student addStudent(Student student) {

        if (!isValidMarks(student)) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        
        Student savedStudent = studentRepository.save(student);
        

        restTemplate.postForObject(
            "http://result-service/api/results/calculate",
            student,
            Void.class
        );
        
        return savedStudent;
    }

    private boolean isValidMarks(Student student) {
        return isValidMarkRange(student.getMathematicsMarks()) &&
               isValidMarkRange(student.getEnglishMarks()) &&
               isValidMarkRange(student.getScienceMarks());
    }

    private boolean isValidMarkRange(int marks) {
        return marks >= 0 && marks <= 100;
    }
}