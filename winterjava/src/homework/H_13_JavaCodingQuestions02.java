package homework;

import java.util.Scanner;

public class H_13_JavaCodingQuestions02 {
	/*
    Print “Please enter your job title” 
    Create a String variable named “jobTitle” and get the data from the user. 
    Use the below test data to print the correct jobTitle. Example :
    if job Title is qa then print “Your job title is Quality Analyst” 
    test data: qa then print Quality Analyst 
    dev then print Developer 
    ba then print Business Analyst 
    pm then print Project Manager
   */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = scanner.nextLine().toLowerCase();
		
		if (jobTitle.equals("qa")) {
			System.out.println("Your job title is Quality Analyst");
			}else if (jobTitle.equals("test data")) {
			System.out.println("Quality Analyst");
			}else if (jobTitle.equals("dev")) {
			System.out.println("Developer");
			}else if (jobTitle.equals("ba")) {
			System.out.println("Business Analyst");
			}else if (jobTitle.equals("pm")) {
			System.out.println("Project Manager");
			}

	}

}
