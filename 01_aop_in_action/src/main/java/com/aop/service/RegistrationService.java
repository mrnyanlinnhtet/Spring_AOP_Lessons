package com.aop.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.dto.Classes;
import com.aop.dto.Registration;
import com.aop.dto.Student;
import com.aop.repo.RegistrationRepo;
import com.aop.repo.StudentRepo;

@Service
public class RegistrationService {
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private RegistrationRepo registraionRepo;
	
	public Registration register(Classes classes,Student student,LocalDate registDate) {
		
	//create student
	var registStudent = studentRepo.create(student);
		
	//create registration
	return registraionRepo.create(new Registration(0,classes,registStudent,registDate));
	}

}
