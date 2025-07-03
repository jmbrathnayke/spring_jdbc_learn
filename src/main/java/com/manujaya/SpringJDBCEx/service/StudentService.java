package com.manujaya.SpringJDBCEx.service;
import com.manujaya.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //method for student
    public void addStudent(Student st) {
        System.out.println("added student");
    }
}
