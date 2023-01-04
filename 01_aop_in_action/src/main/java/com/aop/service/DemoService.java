package com.aop.service;

import org.springframework.stereotype.Component;

import com.aop.dto.Student;

@Component
public class DemoService {

	public void doBusiness(String...data) {
		System.out.println("******* Message From Do Business Method ! *******");
	}
	
	public Student getStudent() {
		return new Student(1,"Mr. Nyan Linn Htet","092234456","nyanlinnhtet@gmail.com");
	}
	
	public int dividedBy(int a, int b) {
		return a/b;
	}
}
