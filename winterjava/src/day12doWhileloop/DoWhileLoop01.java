package day12doWhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
	     If the integer is even print on the console “You won!”
		 Otherwise ask user to enter another integer
		 */

	}
	
	public static void checkIntToBeEven() {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		
		
		do {
			System.out.println("enter en integer");
			num = scanner.nextInt();
			
			
		} while (num%2!=0);
		System.out.println("You won!");
	}

}
