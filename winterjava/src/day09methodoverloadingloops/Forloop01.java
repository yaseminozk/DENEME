package day09methodoverloadingloops;



public class Forloop01 {

	public static void main(String[] args) {
		//printHello();
		printInteger();
		printIntegerreverse();
	}
		/*
		 * Type code to print "Hello World!" 10 times on the console...
		 */
	public static void printHello() {
		
	
		for(int i = 1;i<=10;i++) {
			System.out.println("Hello World!");
		
	}
	
	}
	
	public static void printInteger() {
		
		for(int i=5; i<=12;i++)
			System.out.println(i);}
		
	public static void printIntegerreverse() {
			
			for(int i=12; i<=5;i--)
				System.out.println(i);
	}
}
