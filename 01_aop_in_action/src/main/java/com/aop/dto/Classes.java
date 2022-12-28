package com.aop.dto;

import java.time.LocalDate;

public record Classes(
		int id,
		Course course,
		LocalDate startDate,
		int months
		) {

}
