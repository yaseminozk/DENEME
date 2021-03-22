package week2;

import java.util.Scanner;

public class P_Q04_Switch_TeamName {

	public static void main(String[] args) {
		// Question 1: Type the codes which asks the user to put the 
        //letters for the favorite football club in Turkey. It prints "Galatasaray" for gs, it prints "Trabzonspor" for ts, it prints "Besiktas" 
        //for bjk and it prints "Pis Fenerbahce" for fb. Please use switch statement in your codes.
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the your team abbreviation");
String teamName = scanner.next().toLowerCase();

switch (teamName) {
case "gs":
	System.out.println("Galatasaray");
	break;
case "fb":
	System.out.println("Fenerbahce");
	break;	
case "ts":
	System.out.println("Trabzonspor");
	break;
case "bjk":
	System.out.println("Besiktas");
	break;
default:
	System.out.println("please enter valid team abbreviation");
	break;
}
scanner.close();
	}

}
