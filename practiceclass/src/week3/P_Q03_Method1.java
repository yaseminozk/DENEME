package week3;

import java.util.Scanner;

public class P_Q03_Method1 {

	public static void main(String[] args) {
	/*
	 Write a method named isEven that accepts an integer argument.
	 The method should return true if the argument is even, or false otherwise.
	 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scanner.nextInt();
		
		System.out.println(isEven(num));
		
	}
	public static boolean isEven(int a ) {
		if (a%2==0) {
			return true;
		}else {
			return false;
		}
	}
		
		
		
		
		
		
		
		
		
//		isEven();
//	}
//public static void isEven() {
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("enter an integer");
//	int num = scanner.nextInt();
//	
//	if (num%2==0) {
//		System.out.println("true");
//	}else {
//		System.out.println("false");
//	}
}

