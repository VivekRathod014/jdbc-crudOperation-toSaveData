package com.saveData.controller;

import com.saveData.dto.Student;
import com.saveData.service.StudentService;

public class StudentController {
	
public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Vivek Rathod");
		student.setEmail("rathodvivek014@gmail.com");
		student.setPhno("8104070044");
		
		StudentService studentService = new StudentService();
		Student s = studentService.saveStudent(student);
		if(s!=null) {
			System.out.println(s.getId() + " Saved Successfully ");
		}
	}


}
