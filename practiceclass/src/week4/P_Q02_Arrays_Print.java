package week4;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q02_Arrays_Print {

	public static void main(String[] args) {
	/*
	 Ask user to enter 5 names then assign them to an array
		eg:
		String names = "john Marry william Brian Richard";
		Then print the names and the number of the letters in each word 1 by 1 on the console
	 */
		
		


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 names with space");
		String str = scanner.nextLine();
		String names [] = str.split(" ");
		System.out.println(Arrays.toString(names));
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" "+names[i].length());
		}
	

}
}
