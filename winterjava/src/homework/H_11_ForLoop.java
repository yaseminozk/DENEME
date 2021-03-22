package homework;

import day09methodoverloadingloops.Forloop01;

public class H_11_ForLoop {

	public static void main(String[] args) {
		printNumbers();
		evencounter();
		oddNumber();
		printSum();
		multipily();
		divisioncount();
		
	}

	/*
	1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop. */
		public static void printNumbers() {
			for (int i = 10; i <= 57; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	/*2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.*/
	
			public static void evencounter() {
				for (int s = 102; s >43; s=s-2) {
					System.out.print( s + " ");
				}
				System.out.println();
				}
			
/*3) Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.*/
			public static void oddNumber() {
				for (int i = 199; i >=33; i-=2) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			
/*4) Write a program to add counting numbers from 23 to 57 by using for-loop.
	Print the sum on the console*/
public static void printSum() {
	int sum = 0;
	for (int i = 23; i <=57; i++) {
		sum=sum+i;
		
	}
	System.out.println(sum +" ");
}			

	/*5)Write a program to multiply counting numbers from 7 to 15 by using for-loop.
	Print the multiplication on the console*/
public static void multipily() {
	int sum = 1;
	for (int i = 7; i < 15; i++) {
		sum *=i;
	}
	System.out.println(sum + " ");
}

	/*6)Write a program to print counting numbers which are less than 200
	  and divisible by 5
	On the console by using for-loop. */
public static void divisioncount() {
	for (int i = 200; i >0; i-=5) {
		System.out.print(i + " ");
	}
}
}
