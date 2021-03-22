package day11whileLoopDwhileLoop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		

	}
	/*
	 For the String "1234_?!abcdef", type a code to count the number of letters,
	 the number of digits and the number of others by using do-while loop
	 */
public static void countChars() {
String string = "1234_?!abcdef";
int letterCounter = 0;
int numCounter = 0;
int othercharacterCounter = 0;
int index = 0;

do {
	boolean isDigit = string.charAt(index)>='0'&&string.charAt(index)<='9';
	if (isDigit){
		numCounter++;
	}
	boolean isLetter =string.charAt(index)>='a'&&string.charAt(index)<='z';
	if (isLetter) {
		letterCounter++;
	}
	boolean isOther=!isDigit&&!isLetter;
	othercharacterCounter++;
	
	index++;
} while (index<string.length());
System.out.println("The number of letters is : " + letterCounter);
System.out.println("The number of letters is : " + numCounter);
System.out.println("The number of letters is : " + othercharacterCounter);
}
}
