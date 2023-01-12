package com.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.aop.config.AppConfig;
import com.aop.service.MyService;

@SpringJUnitConfig(classes = AppConfig.class)
public class AspectsJStyleDemoTest {
	
	@Autowired
	private MyService myService;

	 @Test
	 void test() {
		 myService.dividedBy(10, 0);
	 }
}
