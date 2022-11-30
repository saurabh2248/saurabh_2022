package com.basic.dateandtime;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
public class DateTime {

	public static void main(String[] args) {
		//Old format for date and time
		Date todaydate = new Date();
		System.out.println(todaydate);
       
		
		//New format for date and time
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate todays = LocalDate.of(2022, Month.AUGUST, 15);
		System.out.println(todays);
	
		LocalDateTime timeNow = LocalDateTime.now();
		System.out.println(timeNow);
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		LocalTime t1= LocalTime.now(ZoneId.of("CET"));
		System.out.println(t1);
		
		
	}

}
