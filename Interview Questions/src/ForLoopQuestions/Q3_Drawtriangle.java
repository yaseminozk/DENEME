package ForLoopQuestions;

import java.util.Scanner;

public class Q3_Drawtriangle {

	public static void main(String[] args) {
		drawTriangle();
	}
	
	/*
	 	 1)Ask user to enter a positive integer
		 2)Create and print the following image on the console
							       *
							      * *
							     * * *
							    * * * *
							       .
							       .
							       .
	*/
	public static void drawTriangle() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s = scan.nextInt();
		
		
		
		for(int j=1; j<=s;      j++) {
			
			
			for(int i=s-j; i>0;      i--) {
				System.out.print(" ");
			}
			
			
			for(int k=1; k<=j;       k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}

