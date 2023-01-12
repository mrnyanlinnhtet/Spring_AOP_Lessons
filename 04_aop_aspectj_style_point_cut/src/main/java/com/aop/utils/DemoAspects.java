package com.aop.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DemoAspects {

	@Before(value = "com.aop.utils.CommonPointcuts.searchMethods() && com.aop.utils.CommonPointcuts.memberDaoClasses()")
	void beforeLog(JoinPoint joinPoint) {
		System.out.println("Before advice is working !");
		System.out.println("----------------------------");
		System.out.printf("%-16s : %s%n", "Target Class", joinPoint.getTarget().getClass().getSimpleName());
		System.out.printf("%-16s : %s%n", "Method Name", joinPoint.getSignature().getName());
		System.out.println("----------------------------");
	}

}
