package com.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.aop.service.DemoService;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class DemoServiceTest {

	 @Autowired
	 private DemoService demoService;
	 
	 @Test
	 void withoutArgTest() {
		 demoService.voidMethodWithoutArgument();
	 }
}
