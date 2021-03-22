package ForLoopQuestions;

import java.util.Scanner;

public class Q1_Palindrome {

	/*
	 Ask user to enter a String
	 Check the String if it is "Palindrome" or not
	 For example"aba" and "aba"
	 */
	
	public static void main(String[] args) {
		checkPalindrome();
		
	}
	
	public static void checkPalindrome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string to see if it is Palindrome or not");
		String str = scan.nextLine();
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev=rev+str.substring(i, i+1);
			
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		scan.close();
	}
	
}


