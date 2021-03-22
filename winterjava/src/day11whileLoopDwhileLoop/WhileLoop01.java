package day11whileLoopDwhileLoop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 *Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
		 */
	
	
	}
public static void addDigits() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("input an integer");
	int num = scanner.nextInt();
	
	if(num<0) {
		num = num*-1;
	}
	int sum =0;
	while (num!=0) {
		sum = sum + num%10;
		num/=10;
	}
	System.out.println("The sum of digits is: " + sum);
	scanner.close();
}
}
