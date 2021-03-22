package week2;

import java.util.Scanner;

public class P_Q09_FirstThreeLetters {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the name");
		
		String name = scanner.nextLine().trim();
		String firstthree = name.substring(0,2);
		String rest = name.substring(3);
		String starredString = rest.replaceAll("\\w", "*");
		System.out.println(firstthree+starredString);

	}

}
