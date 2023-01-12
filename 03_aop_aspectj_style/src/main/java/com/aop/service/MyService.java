package com.aop.service;

import org.springframework.stereotype.Service;

import com.aop.dto.Result;

@Service
public class MyService {

	public Result hello(String name, int count) {
		System.out.println("Message from MyService class !");
		return new Result("Nyan Linn Htet", 22);
	}

	public int dividedBy(int a, int b) {
		return a / b;
	}
}
