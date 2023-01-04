package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.aop.dto.Student;

public class MethodAccessAspects {

	
	public void beforeExecution(String...data) {
		 System.out.println("Before Method Invocaiton !");
		 
		 for(var r : data) {
			 System.out.println(r);
		 }
	}
	
	public void afterExecution(String[]args) {
		System.out.println("After Method Invocation !");
		 for(var data :args) {
			 System.out.println(data);
		 }
	}
	
	public void afterThrowing(JoinPoint joinPoint,RuntimeException e) {
		System.out.println("After Throwing Method Invoication !");
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getTarget().getClass());
		System.out.print("[");
		 var args = joinPoint.getArgs();	
		 for(int i = 0 ; i<args.length ; i++) {
			 System.out.print(args[i]);
			 if(i < args.length -1) {
				 System.out.print(",");
			 }
		 }
		System.out.print("]");
		System.out.println();
		System.out.println(e.getMessage());
	}
	
	public void afterReturning(Student student) {
		System.out.println("Return Method Invocation !");
		System.out.println(student);
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
