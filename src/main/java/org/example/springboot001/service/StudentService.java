package org.example.springboot001.service;

import lombok.AllArgsConstructor;
import org.example.springboot001.dao.StudentDao;
import org.example.springboot001.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
}
