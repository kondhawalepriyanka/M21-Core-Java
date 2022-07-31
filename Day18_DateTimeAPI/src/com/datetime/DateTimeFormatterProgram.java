package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterProgram {

	public static void main(String[] args) 
	{
		LocalDateTime l=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String dt=df.format(l);
		System.out.println(dt);

	}

}
