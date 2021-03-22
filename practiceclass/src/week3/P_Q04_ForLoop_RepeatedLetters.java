package week3;


import java.util.Iterator;
import java.util.Scanner;

public class P_Q04_ForLoop_RepeatedLetters {

	public static void main(String[] args) {
/*
 *Ask user to enter a name and a character,
then check how many times the character is repeated
in the name using loops in the name
 Example:
        INPUT      :char ch1= 'a' ;
                    String name =“John came late"
        OUTPUT :  2
 */
			
		
		
Scanner scanner = new Scanner(System.in);
System.out.println("enter a name and a character");
String s = scanner.nextLine();
System.out.println("enter a character");
char c = scanner.next().charAt(0);
int counter = 0;
for(int i = 0; i<s.length(); i++) {
	if(c==s.charAt(i)) {
		counter++;
		
	}
}
System.out.println(c+"is repeated " + counter + " times in this String");
	}

}
