package com.manujaya.SpringJDBCEx.repo;
import com.manujaya.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student st) {
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
