package com.research;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitPlus {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2024, Month.MAY,3);
		System.out.println("localDate : "+localDate);
		LocalDate chronoUnitPlus = localDate.plus(2, ChronoUnit.DECADES);
		System.out.println("chronoUnitPlus : "+chronoUnitPlus);
	}
}
