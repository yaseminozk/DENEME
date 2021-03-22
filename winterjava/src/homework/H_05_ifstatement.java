package homework;

import java.util.Scanner;

public class H_05_ifstatement {

	public static void main(String[] args) {
		/*
1) Type java code, if an integer is even, output will be “The integer is even”.
If the integer is odd, output will be “The integer is odd”.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter integer");
		int num1= scanner.nextInt();

		if (num1%2==0) {
			System.out.println("Integer is even");
		}if (num1%2==1) {
			System.out.println("integer is odd");
		}

/*2) Type java code by using if statement. When you enter the initial of the day of a week,
output should be all possible names of the days.
For example; if the initial is ’S’ output should be “Saturday or Sunday”*/
		
	
	System.out.println("enter the first letter of day");
		char letter =scanner.next().toLowerCase().charAt(0);
		if (letter=='m') {
		System.out.println("monday");
	}else if (letter=='t') {
		System.out.println("tuesday or thursday");
	}else if (letter=='w') {
		System.out.println("wednesday");
	}else if (letter=='f') {
		System.out.println("friday");
	}else if (letter=='s') {
		System.out.println("saturday or sunday");
	}else {
		System.out.println("enter a valid letter");
	}
		

/*3) Ask user to enter the values of length and width of a rectangle, then check if it is square or not.*/
		System.out.println("enter length and width");
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		
		if (length==width) {
			System.out.println("it is square");
		}if (length!=width) {
			System.out.println("it is rectangle");
		}

/*4) Type java code by using if statement. When you enter the name of the day of a week,
output will be “Weekday” or “Weekend day” according to the name of the day.
*/
Scanner scan = new Scanner(System.in);
System.out.println("enter the name of day");
String day = scan.nextLine().toLowerCase();

if (day.equals("saturday" ) || day.equals("sunday")) {
	System.out.println("it is weekend");
}else if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")|| day.equals("Thursday")|| day.equals("Friday")) {
	System.out.println("it is week day");
}else {
	System.out.println("enter a valid day name");
}
	}

}
