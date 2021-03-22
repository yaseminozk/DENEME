package WhileLoopQuestions;

import java.util.Scanner;

public class Q3_FactorialFinder {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
	      Write a program to count the factors of an integer which is entered by user.
	      Factors of 12 = 1, 2, 3, 4, 6, 12
		 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter a number");
			int num = scanner.nextInt();
			int factorial = 1;
			
			while(factorial<=num) {
				
				if(num%factorial==0) {
					System.out.println(factorial + " ");
				}
				factorial++;
			}
			scanner.close();
		}
		
		
			
		}