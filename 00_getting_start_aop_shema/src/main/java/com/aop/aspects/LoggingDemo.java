package com.aop.aspects;

public class LoggingDemo {

	 public void beforeProcess() {
		 System.out.println("Before Invocation Method !");
	 }
	 
	 public void afterProcess() {
		 System.out.println("After Invocation Method !");
	 }
}
