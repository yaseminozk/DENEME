package day11whileLoopDwhileLoop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
	/*
	 * Ask user to enter a number
		 If the number user entered is less than 10 print “Won!” on the console
		 Otherwise, ask user to enter a number again.
	 */

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		
		do {
			System.out.println("enter an integer");
			 num = scanner.nextInt();
			
		} while (num>9);
		System.out.println("you won");
	}

}
