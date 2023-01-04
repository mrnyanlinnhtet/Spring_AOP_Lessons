package com.pointcut.demo.admin.service;

import org.springframework.stereotype.Service;

import com.pointcut.demo.HelloEnables;

@Service
public class AdminService implements HelloEnables {

	@Override
	public void hello(String message) {
		System.out.println("Message From Admin Service is %s".formatted(message));
	}

	public void doSomething() {
		System.out.println("I am do something now !");
	}

}
