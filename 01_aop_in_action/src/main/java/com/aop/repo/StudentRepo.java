package com.aop.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aop.dto.Student;

@Repository
public class StudentRepo{

	public Student create(Student student) {
		return null;
	}
	
	public Student upadateStudent(int studentId) {
		return null;
	}
	
	public Student deleteStudent(int studentId) {
		return null;
	}
	
	public Student findById(int studentId) {
		return null;
	}
	
	public List<Student> search(String name,String phone,String email){
		return null;
	}

}
