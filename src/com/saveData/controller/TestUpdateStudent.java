package com.saveData.controller;

import com.saveData.service.StudentService;

public class TestUpdateStudent {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		boolean res = studentService.updateStudentAndEmailByID(1);
		System.out.println(res);
	}

}
