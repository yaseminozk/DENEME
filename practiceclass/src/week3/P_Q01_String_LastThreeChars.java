package week3;

import java.util.Scanner;

public class P_Q01_String_LastThreeChars {

	public static void main(String[] args) {
	/*
	 Write a Java program to take the last three characters 
	 from a given string and
		 *  add the three characters at both the front and back of the string.
		  String length must be greater than three and more.
			INPUT      : Ankara
		    OUTPUT  : araAnkaraara
	 */
//Scanner scanner = new Scanner(System.in);
//System.out.println("enter a string");
//String string = scanner.next();
//String lastthree = string.substring(string.length()-3);
//System.out.println(lastthree+string+lastthree);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scanner.nextLine();
		String lastthree = str.substring(str.length()-3);
		
		System.out.println(lastthree+str+lastthree);
		
	}

}
