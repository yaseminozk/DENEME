package homework;

import java.util.Scanner;





public class H_02_Casting {

	public static void main(String[] args) {
		/*
		 11)Why is eclipse giving error in the following code?
			Fix the bug in two different ways. 
		 */
			float num1 = 3.23f;// 1 Way) adding letter f after the numbers fixes issue
			double num2 = 3.23;
			float num3 = (float)num2;//2 Way) explicit narrowing also solve issue too
			
		
		/*
		 *12) What do you see on the console?
		 byte is between -128 and 127 
		 If you type the following code then what will you see on the console?
		 */
			
		short num4 = 255;
		byte num5 = (byte) num4;
		System.out.println(num5);//-1
		
		/*
		 13) What do you see on the console?
		 */
		
		int num6 = 5/2;
		System.out.println(num6);//2
		float num7 = 5f/2f;
		System.out.println(num7);//2.5
		double num8 = 5d/2d;
		System.out.println(num8);//2.5
		
		/*
		 14) What do you see on the console?
		 */
		
		int a = 5/3;
		System.out.println(a);//1
		float b = 5f/3f;
		System.out.println(b);//1.6666666
		double c = 5d/3d;
		System.out.println(c);//1.6666666666666667
		
		/*
		 15) Write a program to assign a value of 100.235 to a double variable
				and then convert it to int. Print it on the console.
		 */
		
		double x = 100.235;
		int xx = (int)x;
		System.out.println(xx);
		
		/*
		 16) Write a program to add an integer variable having value 5
			and a double variable having value 6.2. Print the sum on the console.
		 */
		
		int aa = 5;
		double bb = 6.2;
		double sum = aa +bb;
		System.out.println(sum);
		
		/*
		 17) Create an integer variable and increase it by 1, by using three
		  	different ways,
			then type every result on the console.
		 */
		int ab = 2;
		 ab += 1;
		 ab = ab+1;
		 ab++;
		 
		 /*
		  18) Create an integer variable and decrease it by 1, by using three 
		  different ways,
			then type every result on the console.
		  */
		 int abc = 2;
		 abc -= 1;
		 abc = abc-1;
		 abc--;
		 
		 /*
		  1) Type a program like;
Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width,
and the sum of the two numbers will be the length of a rectangle.
Then calculate the area and the perimeter of the rectangle, and print them
on the console.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two numbers(first is greater than second)");
		int abcd = scanner.nextInt();
		int bcde = scanner.nextInt();
		int lenght = abcd + bcde;
		int width = abcd%bcde;
		
		System.out.println("Rectangle area is: " + (width*lenght)+ " and perimeter of the rectangle is: "+ (2*(lenght+width)));
		 /*

2) Ask user to enter two integer values. Write a Java Program to swap
two numbers by using the third variable.*/
		
		System.out.println("Enter two integers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int tempnumber = number1;
		number1 = number2;
		number2 = tempnumber;
		
		/*

3) Ask user to enter two integer values. Write a Java Program to swap
two numbers without using the third variable.
		  */
		
		System.out.println("Enter two integers");
		int number3 = scanner.nextInt();//5
		int number4 = scanner.nextInt();//10
		
		number3 =number3+number4;//number3 is now 15
		number4=number3-number4;//number4 is now 5
		number3=number3-number4;//number3 is now 10
	}

}
