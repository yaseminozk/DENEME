package homework;

import java.util.Scanner;

public class H_10_StringManuplation {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
and print it on the console.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scanner.nextInt();
		if (num<10) {
			System.out.println(num*num);
		}else {
			System.out.println(num*2);
		}
		
		/*
		 Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
“This name contains neither ‘a’ nor ‘z’.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your kid's name");
		String name = scan.nextLine();
		name = name.toLowerCase();
		
		if (name.contains("a")==true) {
			System.out.println("this name contains 'a'");
		}else if (name.contains("z")==true) {
			System.out.println("This contains'z'");
		}else {
			System.out.println("This name contains neither 'a' nor 'z'");
		}
		
		/*
		 Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
		 */
		
		System.out.println("enter a letter");
		char letter = scanner.next().charAt(0);
		
		if (letter >= 'A' && letter <= 'Z') {
			if (letter<'F') {
				System.out.println("Big before F");
			}else if (letter>'F') {
				System.out.println("Big after F");
			}else {
				System.out.println("It is just a Big F");
			}
		}
		if (letter >= 'a' && letter <= 'z') {
			if (letter<'h') {
				System.out.println("Small before F");
			}else if (letter>'h') {
				System.out.println("Small after h");
			}else {
				System.out.println("It is just a small h");
			}
		}
		
		/*
		 Ask user ta enter his/her first and last name. If the first name is longer
output will be “First name is longer.” If the length of last name is equal
To the length of last name output will be “First name and last name
have same length.” Otherwise, output will be “Last name is longer”
		 */
		System.out.println("enter first name");
		String firstname = scan.nextLine();
		System.out.println("enter lastname");
		String lastname = scan.nextLine();
		
		if (firstname.length()>lastname.length()) {
			System.out.println("First name is longer");
		}else if (firstname.length()==lastname.length()) {
			System.out.println("Firstname and lastname have same length");
		}else {
			System.out.println("Lastname is longer");
		}
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
For example; if user enters “MARK” output will be “KRAM”
		 */
		System.out.println("enter a word has 4 letter");
		String word = scan.nextLine();
		
		System.out.println(word.substring(3,4)+word.substring(2,3)+word.substring(1,2)+word.substring(0,1));
		/*
		 Ask user to enter a String and output will be the number of the characters in the String.
		 */
		System.out.println("enter a word");
		String word1 = scan.nextLine().trim();
		
		System.out.println(word1.length());
		/*
		 Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions
Output will be “Enter a new password according to the give conditions”

1.First letter must be uppercase
2.Last letter must be lowercase
3.Password must contain 6 characters
		 */
				System.out.println("enter a password");
				String p = scan.nextLine();
				
				if (p.length()==6) {
					if ((p.charAt(0)>= 'A' && p.charAt(0)<='Z')) {
						if (p.charAt(5)>='a' && p.charAt(5)<='z') {
							System.out.println("Your password is created successfully.");
						}else {
							System.out.println("Enter a new password according to the give conditions");
						}
					}else {
						System.out.println("Enter a new password according to the give conditions");
					}
					}else {
						System.out.println("Enter a new password according to the give conditions");
					}
				
				
				
				
		/*
		 Ask user to enter his/her first name, last name and Social Security Number.
Then type a program which makes
a) initials of the first name and the last name in uppercase,
other characters will be in lowercase.
b) all characters except last 4 characters of the Social Security Number “ * ”.

For example; Suleyman Alptekin *****5678
		 */
				 
				Scanner s = new Scanner(System.in);
				System.out.println("enter your first name");
				String fn = s.nextLine();
				System.out.println("enter your last name");
				String ln = s.nextLine();
				System.out.println("enter your Social Security Number");
				String ssn = s.nextLine();
				
				System.out.println(fn.substring(0,1).toUpperCase()+fn.substring(1) 
						+ " " + ln.substring(0,1).toUpperCase()+ln.substring(1)
						+ " " + "*****" + ssn.substring(5));
				

	}}


