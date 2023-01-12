package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource("/application.xml")
public class AppConfig {

}
