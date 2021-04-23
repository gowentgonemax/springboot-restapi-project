package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<student> getStudents(){
        return List.of(
                new student(
                        1L,
                        "Mariam",
                        "marian.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                ));
    }

}
