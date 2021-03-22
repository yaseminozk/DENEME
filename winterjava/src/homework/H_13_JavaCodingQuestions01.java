package homework;

import java.util.Scanner;


public class H_13_JavaCodingQuestions01 {

	/*
	 
    Ask the user to enter an email
   If it doesn't contain the @ sign, print "enter a valid email"
   If it only says "gmail.com" after the @ sign, print "email approved"
   If it says anything other than "gmail.com" after the @ sign, write "Please enter your gmail account"         
   INPUT : techproed.com OUTPUT : “enter a valid email”
   INPUT : techproed@gmail.com OUTPUT : “email approved”
   INPUT : techproed@hotmail.com OUTPUT : “Please enter your gmail account”
   */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your email");
		String mail = scanner.nextLine();
		//techproed@gmail.com 
		
		int signidx = mail.indexOf('@');
		int aftersignidx=signidx+1;
	
		if (signidx==-1) {
		System.out.println("enter a valid email");
			}else if  (mail.substring(aftersignidx).equals("gmail.com")) {
			System.out.println("email approved");
				}else {
				System.out.println("Please enter your gmail account");
			}
			} 
}


