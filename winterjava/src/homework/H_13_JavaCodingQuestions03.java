package homework;

import java.util.Scanner;

public class H_13_JavaCodingQuestions03 {
	/*
	Create a class : “NestedIfStatements”
		
	ask user to enter 2 birth dates
		
	Get the year, months, and day as integer then find the older person using Nested if statements
		
			Examples:
		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
		int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
		Yusuf is Older           
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Yusuf's birth date like yyyymmdd");
		int date1 = scanner.nextInt();
		System.out.println("Please enter Mehmet's birth date yyyymmdd");
		int date2 = scanner.nextInt();
		
		
		if (date1<date2 ) {
			System.out.println("Yusuf is older");
		}else if (date1>date2) {
			System.out.println("Mehmet is older");
		}else {
			System.out.println("they born in same day");
			}
	}}
