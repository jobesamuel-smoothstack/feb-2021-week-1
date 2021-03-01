package com.ss.day.five;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class DateTimeExample {

	public static void main(String[] args) {
		/*
		 * 1) Which class would you use to store your birthday in years, months, days,
		 * seconds, and nanoseconds?
		 * 
		 * LocalDateTime
		 *
		 * 2) Given a random date, how would you find the date of the previous Thursday?
		 */
		System.out.println("PREVIOUS THURSDAY");
		LocalDate random = LocalDate.now();
		LocalDate previousThursday = random.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println(previousThursday);

		/*
		 * 3) What is the difference between a ZoneId and a ZoneOffset?
		 * 
		 * ZoneOffest represents fixed hours and minutes, representing the difference
		 * between the time in current time-zone and GMT/UTC. ZoneId is a representation
		 * of the time-zone.
		 * 
		 */

		/*
		 * 4) How would you convert an Instant to a ZonedDateTime? How would you convert
		 * a ZonedDateTime to an Instant?
		 */
		
		Instant instant = Instant.now();
		ZonedDateTime zoneDateTime = instant.atZone(ZoneId.of("Europe/Paris"));

		zoneDateTime = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris"));
		instant = zoneDateTime.toInstant();

		/*
		 * 5) Write an example that, for a given year, reports the length of each month
		 * within that year.
		 */
		System.out.println("\nLENGTH OF EACH MONTH IN GIVEN YEAR");
		int year = 2021;
		System.out.println("Year: " + year);
		for (int i = 1; i <= 12; i++) {
			YearMonth month = YearMonth.of(year, i);
			int days = month.lengthOfMonth();
			System.out.println("Month: " + month.getMonth() + " Days: " + days);
		}

		/*
		 * 6) Write an example that, for a given month of the current year, lists all of
		 * the Mondays in that month.
		 */
		int month = 1;
		System.out.println("\nMONDAY IN GIVEN MONTH OF CURRENT YEAR");
		List<LocalDate> mondays = new ArrayList<>();
		LocalDate firstDayOfMonth = LocalDate.of(LocalDate.now().getYear(), month, 1);
		LocalDate monday = firstDayOfMonth.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		while (monday.isBefore(firstDayOfMonth.withDayOfMonth(firstDayOfMonth.lengthOfMonth()))){
			mondays.add(monday);
			monday = monday.plusWeeks(1);
			System.out.println(monday);
		}

		/*
		 * 7) Write an example that tests whether a given date occurs on Friday the
		 * 13th.
		 */
		System.out.println("\nDATE OCCURS ON FRIDAY 13th");
		LocalDate date = LocalDate.now();
		if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY) && date.getDayOfMonth() == 13) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
	}

}
