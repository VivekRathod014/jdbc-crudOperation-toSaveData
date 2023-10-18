package com.saveData.service;

import com.saveData.dao.StudentDao;
import com.saveData.dto.Student;

public class StudentService {
StudentDao studentdao = new StudentDao();
	
	public Student saveStudent(Student student) {
		return studentdao.saveStudent(student);
	}
	
	public boolean deleteStudentByID(int id) {
		return studentdao.deleteStudentByID(1);
	}
	
    public boolean updateStudentAndEmailByID(int id) {
    	return studentdao.updateStudentNameAndEmailByID("vishal", "vishal@gmail.com", 1);
    }
    
   public void studentQueryWithId(int id) {
	   studentdao.studentQueryWithId(id);
   }

}
