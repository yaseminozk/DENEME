package homework;

import java.util.Scanner;




public class H_06_IfElseIf {

	public static void main(String[] args) {
	/*
	 1)Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers” */
Scanner scanner = new Scanner(System.in);
System.out.println("enter two integers");
int num1 = scanner.nextInt();
int num2 = scanner.nextInt();

if(num1>0 && num2>0) {
	System.out.println(num1+num2);
}else if (num1<0 && num2<0) {
	System.out.println(num1*num2);
}else {
	System.out.println("I cannot add or multiply different signed numbers");
}
/*
 2)Type java code by using if-else if() statement,
If age is less than 13 output will be “Should not work”,
If age is greater than 65 output will be “Retired”,
Otherwise; output will be “Should work”
 */
System.out.println("what is your age?");
int age = scanner.nextInt();
if (age<13) {
	System.out.println("Should not work");
}else if (age>65) {
	System.out.println("Retired");
}else if (age<0) {
	System.out.println("enter a valid age");
}else {
	System.out.println("should work");
}
/*
 3)Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
 */
System.out.println("enter your mark");
int mark = scanner.nextInt();

if (mark<0 && mark>100) {
	System.out.println("please a valid mark");
}else if (mark<50) {
	System.out.println("your grade is D");
}else if (mark>=50 && mark<60) {
	System.out.println("Your grade is C");
}else if (mark>=60 && mark<81) {
	System.out.println("your grade is B");
}else if (mark>=81 && mark<100) {
	System.out.println("your grade is A");
}
/*
 4) Ask user to enter year
Type java code by using if-else if() statement.
Write a program to check if a year is leap year or not.
if the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */
System.out.println("enter a year");
int year = scanner.nextInt();

if (year<0) {
	System.out.println("enter a valid year");
}else if ((year%100==0 && year%400==0)||(year%100!=0 && year%4==0)) {
	System.out.println("It is a leap year");
}else {
	System.out.println("It is not a leap year");
}
/*5)Ask user to enter annual salary, if the salary is more than or equal
to $80.000 output will be “I accept the offer”, if the salary is between
$60.000 and $80.000 out put will be “I negotiate to increase”,
otherwise output will be “I do not accept the offer.”
	 */
System.out.println("enter a annual salary");
int salary = scanner.nextInt();

if (salary>80000) {
	System.out.println("I accept the offer");
}else if (salary>60000 && salary<80000) {
	System.out.println("i negotiate to increase");
}else {
	System.out.println("I do not accept the offer");
}
	}

}
