package com.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Calculate days between 2 dates

public class CalculateDaysBetweenTwoDays 
{

	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(3);
		System.out.println(date2);
		long df=ChronoUnit.DAYS.between(date1, date2);
		System.out.println(df);
	}

}
