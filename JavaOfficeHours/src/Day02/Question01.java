package Day02;

import java.util.Scanner;


public class Question01 {

	public static void main(String[] args) {
		
		 /*
         * Write a Java program that asks to user 2 questions
         * 1 = how many tea do you drink in a day?
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("How many tea do you drink in a day?");
		 int tea = scanner.nextInt();
		 System.out.println("How many sugar do you use?");
		 int sugar = scanner.nextInt();
		 
		 int day = tea*sugar;
		 double yearGr= ((day*365)*2.7)/1000;
		 double fourtyyear=yearGr*40;
		 
		 if (sugar==0) {
			System.out.println("Good Job, less sugar more health");
		}else {
			System.out.println("You consume; " + "\n" + yearGr + " kg sugar in a year" + 
											"\n" + fourtyyear + " kg sugar in 40 years");
		}

				 
	}

}
