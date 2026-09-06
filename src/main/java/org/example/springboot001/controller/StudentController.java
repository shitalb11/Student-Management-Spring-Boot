package org.example.springboot001.controller;

import lombok.AllArgsConstructor;
import org.example.springboot001.model.Student;
import org.example.springboot001.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

@GetMapping
    public List<Student> getStudents(){
    return studentService.getAllStudents();
}
}
