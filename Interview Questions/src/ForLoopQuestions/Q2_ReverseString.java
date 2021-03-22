package ForLoopQuestions;

import java.util.Scanner;

public class Q2_ReverseString {

	
	public static void main(String[] args) {
		printstring();
	}
	
	public static void	printstring () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		
		String word = scanner.nextLine();
	    for(int i = word.length()-1; i>=0; i--) {
	    	System.out.print(word.charAt(i));
	    }
}
}
