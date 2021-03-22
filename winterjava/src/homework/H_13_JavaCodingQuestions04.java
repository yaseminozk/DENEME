package homework;

import java.util.Scanner;

public class H_13_JavaCodingQuestions04 {
	/* 
	Let's get 3 positive integers from the user    
	check if these three numbers are triangular.
	If it can be a triangle, let's check if it is an equilateral triangle.

	* The conditions of being triangle.
	a+b>c>a-b 
	a+c>b>a-c 
	b+c>a>b-c 

	* The conditions of being equilateral triangle.
	a=b=c  

	Let's print the following situations on the console.
	equilateral triangle
	only triangle
	not triangle
	         */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an positive int a");
		int a = scanner.nextInt();
		System.out.println("Please enter an positive int b");
		int b = scanner.nextInt();
		System.out.println("Please enter an positive int c");
		int c = scanner.nextInt();
		
		
		
		
		if (a<0 || b<0 || c<0) {
			System.out.println("please enter positive number");
				}if ((a+b > c  ) && (a+c > b ) && (b+c > a )&&(c>a-b) && (b>a-c) && (c>b-c)) {
					System.out.println("only triangle");
				}else if (a==b && b==c) {
					System.out.println("equilateral triangle");
				}else {
					System.out.println("not triangle");
		}
	}
}


