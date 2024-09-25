package com.SpringbootNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        try {
            System.out.println("Received student: " + student); // Debug line
            return studentRepository.save(student);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage()); // Print error
            throw e; // Rethrow the exception to be handled by the global handler
        }
    }

    // New search method
    @GetMapping("/search")
    public List<Student> searchStudent(@RequestParam String name) {
        return studentRepository.findByName(name);
    }
}
