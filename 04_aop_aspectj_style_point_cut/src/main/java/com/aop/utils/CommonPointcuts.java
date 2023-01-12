package com.aop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CommonPointcuts {

	@Pointcut("execution(public * search*(..))")
	public void searchMethods() {
	}

	@Pointcut("within(com..dao.member.*)")
	public void memberDaoClasses() {
	}

	@Pointcut("@within(com.aop.utils.SearchLog)")
	public void adminSearch() {
	}

}
