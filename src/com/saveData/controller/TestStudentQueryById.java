package com.saveData.controller;

import com.saveData.service.StudentService;

public class TestStudentQueryById {
	
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.studentQueryWithId(1);
	}

}
