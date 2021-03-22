package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
	
	/*
	 One more String Method...
	 split() method is used to split a String by using specific character/s
	 split() method puts the splitting parts into array
	 */

	public static void main(String[] args) {
		String string = "JavaGood";
		String arr[] = string.split("a");
		 System.out.println(Arrays.toString(arr));//[J,v,Good]
		 
		 String brr[]=string.split("");
		 System.out.println(Arrays.toString(brr));//[J, a, v, a, G, o, o, d]
		 
		 System.out.println(brr.length);//8
		 
		 String string2 = "Ali Can come here";
		 String crr[]=string2.split(" ");
		 System.out.println(crr.length);//4 because [Ali,Can,Come,here]
		 

	}

}
