package com.aop.service;

import org.springframework.stereotype.Component;

@Component
public class DemoService {

	public void voidMethodWithoutArgument() {
		System.out.println("******* Void Method Without Method Argument *******");
	}
}
