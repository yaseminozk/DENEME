package day10forloop;

import java.util.Scanner;


public class ForLoop01 {

	public static void main(String[] args) {
		//printEvenInt ();
		//printEvenIntWay2();
		//print5();
		printstring();
		
		/*
		 Print all even integers from 100 to 23 on the console in the
		 same line and space among them
		 */
	
		}
	
//public static void	printEvenInt () {
//		
//		for(int i = 100; i>22; i--) {
//			if (i%2==0) {
//				System.out.print(i + " ");
//			}
		
//	 public static void	printEvenIntWay2 () {
//		
//	for(int i = 100; i>22; i=i-2) {
//			
//				System.out.print(i + " ");
//	}}
		
//Print all integers which are divisible by 5 from 100 to 23 on the console in the same line
				//with a space

				/*public static void	print5 () {
					
					for(int i = 100; i>22; i=i-5) {
							
								System.out.print(i + " ");			

}
}*/
				/*
				 INTERVIEW QUESTION Ask user to enter a string
				 print string reverse
				 For example==> Ali to ilA
				 */
	public static void	printstring () {
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter a string");
				
				String word = scanner.nextLine();
			    for(int i = word.length()-1; i>=0; i--) {
			    	System.out.print(word.charAt(i));
			    }
	}}
