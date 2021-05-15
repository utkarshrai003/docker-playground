package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    Logger logger = LoggerFactory.getLogger(StudentService.class);

    public List<Student> getStudentList() {
        Student student = new Student();
        student.setClas('A');
        student.setName("Ansh");
        student.setStudentId(19);
        List<Student> resultList = new ArrayList<>();
        resultList.add(student);
        return resultList;
    }
}
