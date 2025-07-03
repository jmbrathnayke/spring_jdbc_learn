package com.manujaya.SpringJDBCEx;

import com.manujaya.SpringJDBCEx.model.Student;
import com.manujaya.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringJdbcExApplication.class, args);
		//set Student object
		Student st = context.getBean(Student.class);
		//set values
		st.setRollNo(1);
		st.setName("Manujaya");
		st.setMarks(80);

        //Object for service
		StudentService service = context.getBean(StudentService.class);

		service.addStudent(st);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}



}
