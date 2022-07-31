package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDateTime 
{

	public static void main(String[] args) 
	{
		String datetime="2022-07-31 10:15";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime,df);
		System.out.println(l);
	}

}
