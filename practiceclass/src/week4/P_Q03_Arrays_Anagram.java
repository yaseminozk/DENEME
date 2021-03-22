package week4;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q03_Arrays_Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram is to create a new word from other word's letters.
		 * Write java code to check if two words are anagram or not
		 * isAnagram("listen", "Silent") ==> anagram
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first String");
		String str = scanner.nextLine();
		System.out.println("enter first String");
		String str1 = scanner.nextLine();
		
		String apart  [] = str.split("");
		
		
	}
	public static String isAnagram(String s1, String s2) {
		String arr1[] = s1.toLowerCase().replace(" ", "").split("");
		String arr2[] = s2.toLowerCase().replace(" ", "").split("");
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		if(Arrays.equals(arr1, arr2)) {
			return "Anagram";
		}else {
			return "Not anagram";
		}
	}

}
