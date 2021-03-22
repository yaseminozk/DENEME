package homework;

import java.util.Scanner;


public class H_07_NestedIf {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		if (num%2==0) {
			if (num%3==0) {
				System.out.println("perfect even number");
			}else {
				System.out.println("good even number");
			
			}}else if (num%2==1) {
			if (num%3==0) {
				System.out.println("perfect odd number");
			}else {
				System.out.println("good odd number");
			}
		}
	
/*
 Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */
System.out.println("enter a year");
int year = scanner.nextInt();

if (year%100==0 && year%400==0) {
	System.out.println("it is a leap year");}
else if (year%100!=0 && year%4==0) {
			System.out.println("it is a leap year");
		}
else {
			System.out.println("it is not aleap year");
		}
/*
 Type java code by using nested if() statement.
Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
 */


Scanner scan = new Scanner(System.in);
System.out.println("enter a password");
String password = scan.nextLine();

if (password.charAt(0)>='A' && password.charAt(0)<='Z') {
	if (password.charAt(0)=='A') {
		System.out.println("Valid password");
	}else {
		System.out.println("Invalid password");
	}
}else if (password.charAt(0)>='a' && password.charAt(0)<='z') {
	if (password.charAt(0)=='z'){
		System.out.println("Valid password");
	}else {
		System.out.println("Invalid password");
	}

	}}}

