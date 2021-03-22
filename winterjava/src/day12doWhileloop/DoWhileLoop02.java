package day12doWhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
	/*
	 Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	 */
	}
	
	
		public static void checkInitial() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your first name");
			String fn = "";
			
			do {
				
				fn = scan.next();
				
				if(fn.charAt(0)>='A' && fn.charAt(0)<='Z') {
					System.out.println("You did it correct!...");
				}else {
					System.out.println("Please, make the initial uppercase");
				}
				
			}while(!(fn.charAt(0)>='A' && fn.charAt(0)<='Z'));
			
			scan.close();
			
			/*
			 2.nd WAY:
			 public static void checkinitial(){
			 Scanner scan = new Scanner(System.in);
			 System.out.println("Enter your firstname please");
			 String fn = "":
			 
			 do{
			 fn=scan.next();
			 if(fn.charAt(0)>='A' && fn.charAt<='Z'{
			 System.out.println("You did it right");
			 }else{
			  System.out.println("Make the initial upper case";
			  }
			  
			  }while(!(fn.charAt(0)>='A' && fn.charAt(0)<='Z'));
			 */
		}

	
	}


