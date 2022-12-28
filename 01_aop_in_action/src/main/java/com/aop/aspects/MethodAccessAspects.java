package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MethodAccessAspects {

	
	public void beforeExecution(JoinPoint joinPoint) {
		
	}
	
	public void afterExecution(JoinPoint joinPoint) {
		
	}
	
	public void afterThrowing(JoinPoint joinPoint) {
		
	}
	
	public void AfterReturning(JoinPoint joinPoint) {
		
	}
	
	public Object aroundInvocation(ProceedingJoinPoint joinPoint) {
		Object result = null;
		
		  try {
			  //Before Execution
			  System.out.println("Before Execution !");
			result = joinPoint.proceed();
			//After Returning
			System.out.println("After Returning !");
			return result;
		} catch (Throwable e) {
			//After Throwing
			System.out.println("After Throwing !");
			throw new RuntimeException(e);
		}finally {
			//After Execution
			System.out.println("After Execution !");
		}
	}
}
