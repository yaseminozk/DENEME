package day12doWhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter password.
		 If the password has more than 6 characters print “It is okay”
		 Otherwise, print “Make the password longer than 6 characters” and ask user to enter a new password
		 */
		
		passwordask();
		
	}

	public static void passwordask() {
		Scanner scanner = new Scanner(System.in);
		
		String password= "";
		
		do {
			System.out.println("enter a password");
			password=scanner.nextLine();
			
			if (password.length()>6) {
				System.out.println("it is ok");
			}else {
				System.out.println("make the password longer than 6 characters");
			}
		} while (!(password.length()>6));
		
	}
}
