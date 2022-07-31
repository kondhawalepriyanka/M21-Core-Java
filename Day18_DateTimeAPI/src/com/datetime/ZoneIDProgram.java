package com.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIDProgram {

	public static void main(String[] args)
	{
		LocalTime t=LocalTime.now(ZoneId.of("America/Cuiaba"));
		LocalDateTime dt=LocalDateTime.now(ZoneId.of("Indian/Mahe"));
		System.out.println(t);
		System.out.println(dt);
		for(String s:ZoneId.getAvailableZoneIds())   //Displays All countries name
		{
			System.out.println(s);
		}
	}
	
}
