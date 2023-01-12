package com.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.aop.dto.Result;

@Aspect
@Component
public class MyConcern {

	@Before(value = "bean(myService) && args(value,*)", argNames = "value")
	public void beforeLogger(String value) {
		System.out.println("Before Logger is working !");
		System.out.println("Value is %s".formatted(value));
	}

	@AfterReturning(value = "bean(myService) && execution(com.aop..Result *(..)) && args(name,age)", returning = "result", argNames = "result,name,age")
	public void afterReturning(Result result, String name, int age) {
		System.out.println("After returning is working !");
		System.out.println("Name is %s and Age is %s".formatted(result.name(), result.age()));
		System.out.println("Simple----------- Name : %s and Age : %d".formatted(name, age));
	}

	@AfterThrowing(pointcut = "bean(myService) && args(a,b)", throwing = "ex", argNames = "ex,a,b")
	public void afterThrowing(RuntimeException ex, int a, int b) {
		System.out.println("After throwing is working !");
		System.out.println("Exception Name : %s".formatted(ex.getClass().getSimpleName()));
		System.out.println("Error Message : %s".formatted(ex.getMessage()));
		System.out.println("Args A is %s and Args B is %s".formatted(a, b));
	}

	@After(value = "bean(myService) && args(*,count)", argNames = "count")
	public void afterLogger(int count) {
		System.out.println("After Logger is Working !");
		System.out.println("Count is %d".formatted(count));
	}

	@Around(value = "bean(myService) && args(value,count)", argNames = "value,count")
	public Object aroundInvocation(ProceedingJoinPoint jonPoint, String value, int count) {
		Object obj = null;
		System.out.println("Around:Before Invocation");
		System.out.println("Value is %s and Count is %d".formatted(value, count));
		try {
			obj = jonPoint.proceed();
			System.out.println("Around:After Retrning");
		} catch (Throwable e) {
			System.out.println("Around:After Throwing");
			throw new RuntimeException(e);
		} finally {
			System.out.println("Around:After Invocation");
		}
		return obj;
	}

}
