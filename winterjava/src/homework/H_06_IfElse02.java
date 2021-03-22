package homework;

import java.util.Scanner;

public class H_06_IfElse02 {

	public static void main(String[] args) {
		/*
		 3)Ask user ta enter any name of the week, then get second ,fourth,
and sixth letter of the day name and print them on the console,
in the same line.
For example; if the user enters “Monday” output will be “ody”
		 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter name of week day");
			String day = scanner.next();
			System.out.println(""+day.charAt(1)+""+day.charAt(3)+""+day.charAt(5));
			
/*
 4)Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
 */
	Scanner scan = new Scanner(System.in);
	System.out.println("what is the password");
	String password = scan.nextLine();
	
	if (password.equals("JavaLearner")) {
		System.out.println("The password is true");
	}else {
		System.out.println("The password is false");
	}
	
/*
 Write a program to print absolute value of a number entered by user.
Absolute Value: If the number is positive or zero return the number itself
If the number is negative return the number after multiplying by -1	
 */
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("enter a number");
	int num = scan1.nextInt();
	
	if (num>=0) {
		System.out.println(num);
	}else {
		System.out.println(num*-1);
	}
	
	/*
	 A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity and unit price then judge and print total cost for user.
If the quantity is less than 1000 output will be “No discount.”
	 */
	Scanner scan2 = new Scanner(System.in);
	System.out.println("enter quantitiy");
	int quantity = scan2.nextInt();
	System.out.println("what is the unit price?");
	int unit = scan2.nextInt();
	
	if (quantity>1000) {
		System.out.println("after %10 discount your cost is: " + ((quantity*unit)*0.9));
	}else {
		System.out.println("No discount");
	}
	/*
	 Ask user ta enter a 4 digits integer, then print the sum of the first
and the last digit of the number on console.
For example; if user enters 1234 you will add 1 and 4,
then print on the console 5
	 */
	Scanner scan5 = new Scanner(System.in);
	System.out.println("enter four digit integer");
	int num5 = scan5.nextInt();
	System.out.println((num5%10)+(num5/1000));
	
	
	}

}
