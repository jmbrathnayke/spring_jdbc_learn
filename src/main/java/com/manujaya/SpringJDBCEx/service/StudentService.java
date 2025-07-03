package com.manujaya.SpringJDBCEx.service;
import com.manujaya.SpringJDBCEx.model.Student;
import com.manujaya.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;

    //method for student
    public void addStudent(Student st) {
        repo.save(st);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
