package Day03;

import java.util.Arrays;
import java.util.Scanner;

public class Office_1_ConvertingStringToCharArray {

	public static void main(String[] args) {
		/*
		 * create a custom return type method accepts a name as parameter
        * and prints the name as a char array
        *
        * (do not use toCharArray() method)
        *
        * Input : John
        * Output : [J, o, h, n]
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name");
		String str = scanner.next();
		String arr []= str.split("");
		System.out.println(Arrays.toString(arr));

	}

}

/*
 * 
 * 2.nd WAY
 public static void main(String[] args) {
		String input = "John";
		charArray(input);
	}
​
	private static void charArray(String input) {
		char output[] = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			output[i]=input.charAt(i);
		}
		System.out.println(Arrays.toString(output));
	}
​
}
 */
