package homework;

import java.util.Scanner;

public class H_06_IfElseIf02 {

	public static void main(String[] args) {
		/*
		1) Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
		else output will be “No need to work”
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your age");
		int age = scanner.nextInt();
		
		if (age<0) {
			System.out.println("Enter a valid age");
		}else if (age >17 && age<66) {
			System.out.println("You should work");
		}else {
			System.out.println("no need to work");
		}
		/*
		 2) Ask user to enter a character, then check whether the character is alphabet or not
		 */
		
		System.out.println("enter a character");
		char char1= scanner.next().toLowerCase().charAt(0);
		
		if (char1>='a' && char1<='z') {
			System.out.println("the character is alphabet");
		}else {
			System.out.println("the character is not belong to alphabet");
			
		}
	}

}
