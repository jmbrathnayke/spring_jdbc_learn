package com.manujaya.SpringJDBCEx.repo;
import com.manujaya.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    //getters and setters
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    //save method
    public void save(Student st) {

        String sql = "insert into Student (rollNo, name ,marks) Values (?,?,?)";
        int rows = jdbc.update(sql, st.getRollNo(),st.getName(),st.getMarks());
        System.out.println(rows + "effected");
    }


    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
