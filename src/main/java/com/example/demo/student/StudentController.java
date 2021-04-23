package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentservice;

    @Autowired
    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }
    @GetMapping
    public List<student> getStudents(){
        return studentservice.getStudents();
    }
}
