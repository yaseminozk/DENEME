package day20passbyvaluepassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
	
			//How to create date object
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate1);//2021-03-07
		
		System.out.println( currentDate1.plusDays(5));//2021-03-12
		
		System.out.println( currentDate1.plusMonths(3));//2021-06-07
		
		System.out.println( currentDate1.plusYears(2));//2023-03-07
		
		System.out.println( currentDate1.plusDays(3).plusMonths(2).plusYears(1));//2022-05-10
		
		
		System.out.println(currentDate1.getYear());//2021
		System.out.println(currentDate1.getMonth());//MARCH
		System.out.println(currentDate1.getMonthValue());//3
		System.out.println(currentDate1.getDayOfMonth());//7
		System.out.println(currentDate1.getDayOfYear());//66
		System.out.println(currentDate1.getDayOfWeek());//SUNDAY
		
		System.out.println(currentDate1.minusDays(5).minusMonths(2).minusYears(10));//2011-01-02
		
		LocalDate date2 = LocalDate.of(2019, 03, 05);
		System.out.println(currentDate1.isAfter(date2));//true
		System.out.println(currentDate1.isBefore(date2));//false
		
		//How to create time object
		LocalTime currentTime1 = LocalTime.now();
		
		System.out.println(currentTime1);//14:06:43.895494
		System.out.println(currentTime1.plusMinutes(11));//14:17:43.895494
		
		for (int i = 0; i < 10000; i++) {
			i++;
		}
		LocalTime currentTime2 = LocalTime.now();
		System.out.println(currentTime2);
		
		//to test performans testing time
		System.out.println(currentTime2.getNano()-currentTime1.getNano());//348000
		
		System.out.println(currentTime1.plusHours(3));//test the other plus methods
		System.out.println(currentTime1.getSecond());//52 test the other plus methods
		System.out.println(currentTime1.minusMinutes(6));//test the other minus methods
		System.out.println(currentTime1.now(ZoneId.of("Japan")));//04:20:13.341070
		System.out.println(currentTime1.now(ZoneId.of("Turkey")));//22:20:13.342059
		
		//How to create an object from LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);//2021-03-07T14:22:08.490926
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);//2021-03-07
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		//M==>Months, m==>minutes
		//MMM==>First 3 characters
		//MM==>The number of the month (03-04-etc)
		//MMMM==>Full month name
		//M==>The number of month (3-4-etc.)
		
		System.out.println(dtf2.format(currentDate2.plusMonths(9)));//21/Dec/07
		
		LocalTime currentTime21 = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");//hh==> is for am-pm time format
																														  //HH==> is for 24 hours system
		
		System.out.println(dtf3.format(currentTime21));//02:40
		
		
		
			
		
		
		
	}

}
