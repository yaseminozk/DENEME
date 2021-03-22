package day10forloop;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		

	}
/*
 Ask user to enter beginning and ending values.
 Type code to calculate the multiplication of the integer
 */
	public static void productOfInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the starting Integer of value");
		int s = scanner.nextInt();
		System.out.println("enter the ending Integer of value");
		int e = scanner.nextInt();
		
		int product = 1;
		
		for(int i=s; i<=e; i++) {
			product =product *i;
	}
		System.out.println(product);
		scanner.close();
}
}
