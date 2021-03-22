package Day01;
import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		/*
        Write a program in Java to input 5 numbers from keyboard and find their sum and average.
EXAMPLE:
   INPUT      :  
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5              
     OUTPUT : 
 
The sum of 5 number is : 15
The Average is : 3.0       
   */
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter five numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		double average = (a+b+c+d+e)/5;
		double sum = (a+b+c+d+e);
		
		System.out.println("average is: " + average + " and sum is: " +sum);
		scanner.close();
	}

}
