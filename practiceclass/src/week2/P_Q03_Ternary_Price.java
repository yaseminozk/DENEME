package week2;

import java.util.Scanner;

public class P_Q03_Ternary_Price {

	public static void main(String[] args) {
		/*
        Write a code using ternary:
 Create int variable : price
 Create string variable : decision
 If the price = $10 Print “it's cheap”
 If price is 10-$20 print “it's ok” 
 Otherwise “it's expensive”.
ORNEK:
    INPUT      : price= 12                
    OUTPUT  : it's ok
    INPUT      : price= 10                
    OUTPUT  : it's cheap
    INPUT      : price= 23                
    OUTPUT  : it's expensive
        */
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("What is the price");
		int price = scanner.nextInt();
		
		String desicion = price<=10?"It is cheap":price>10 && price<20?"it is ok":"it is expensive";
		System.out.println(desicion);
		
		scanner.close();
	}

}
