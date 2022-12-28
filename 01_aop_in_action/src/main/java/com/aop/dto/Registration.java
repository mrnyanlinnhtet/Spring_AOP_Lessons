package com.aop.dto;

import java.time.LocalDate;

public record Registration(
		 int id,
		 Classes classes,
		 Student student,
		 LocalDate registrationDate
		 ){

}
