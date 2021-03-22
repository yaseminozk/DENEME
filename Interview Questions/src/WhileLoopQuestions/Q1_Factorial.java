package WhileLoopQuestions;

import java.util.Scanner;

public class Q1_Factorial {

	public static void main(String[] args) {
		
			factorial();

		}
	/*
	 Get an integer from user and calculate the factorial
	 For example; user==> 5 ==> 5!=120
	 */
		
		public static void factorial() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter an integer number");
			int d = scanner.nextInt();
			
			int i = 1;
			int result = 1;
			
			while(i<=d) {
				result = result*i;
				i++;
			}
			System.out.println(result);
			scanner.close();
		}
	}
