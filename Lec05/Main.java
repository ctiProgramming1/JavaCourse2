package Lec05;
/*
 * Lecture 05: Date and Time 
 * 
 * Source: https://www.w3schools.com/java/java_date.asp
 * Source: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		// Date
		LocalDate birthday = LocalDate.of(2001, 10, 12);
		LocalDate today = LocalDate.now();	
		
		// find the years, months, days between two dates
		long years = ChronoUnit.YEARS.between(birthday, today);
		long months = ChronoUnit.MONTHS.between(birthday.plusYears(years), today);
		long days = ChronoUnit.DAYS.between(birthday.plusYears(years).plusMonths(months), today);
		
		// Format the printing
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd/MMM/yyyy");
		
		System.out.println("My birthday is " + birthday.format(formatter));	
		System.out.print("My Age is " + years + " years and " + months + " months");
		System.out.println(" and " + days + " days");
		
		// Parse String into LocalDate
		LocalDate date = LocalDate.parse("2001-10-12");
		System.out.println(date);
		
		// Time
		LocalTime now = LocalTime.now();
		LocalTime time1 = LocalTime.of(11, 30);
		
		formatter = DateTimeFormatter.ofPattern("h:m a");
			
		System.out.println(now.format(formatter));
		System.out.println(time1.format(formatter));
		
		LocalDateTime timestamp = LocalDateTime.now();
		formatter = DateTimeFormatter.ofPattern("E dd/MMM/yyyy h:m a");

		System.out.println(timestamp.format(formatter));
	}
}