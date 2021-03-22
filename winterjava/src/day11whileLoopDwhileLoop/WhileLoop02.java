package day11whileLoopDwhileLoop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
	/*
	 Type java code by using while loop,
      Write a program to count the factors of an integer which is entered by user.
      Factors of 12 = 1, 2, 3, 4, 6, 12
	 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		int i = 1;
		
		while(i<=num) {
			
			if(num%i==0) {
				System.out.println(i + " ");
			}
			i++;
		}
		scanner.close();
	}
	
	
		
	}


