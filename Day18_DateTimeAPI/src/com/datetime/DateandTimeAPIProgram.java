package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
public class DateandTimeAPIProgram 
{

	public static void main(String[] args)
	{
		LocalDate l=LocalDate.now();           //to create date method
		System.out.println(l);			       //will display date
		
		LocalTime t=LocalTime.now();		    // to create time method
		System.out.println(t);                  //will display time
		
		LocalDateTime dt=LocalDateTime.now();   // to create date and time method
		System.out.println(dt);                //will display both date and time
		
		LocalDate d=LocalDate.of(2022,Month.MARCH,31); // to check given date is valid or not
		System.out.println(d); 
	}

}
