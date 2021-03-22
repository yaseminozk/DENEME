package homework;

public class H_04_concatination {

	public static void main(String[] args) {
/*
int numA = 2;
int numB = 3;
String str1 = “Study”
String str2 = “Hard”
Type a program to see the following outputs on the console
by using “concatenation” operation.
A) Study Hard B) 5 Study C) Hard23 D) Hard1
 */
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		System.out.println(str1+" "+str2);//Study Hard 
		System.out.println(str1);//Study
		System.out.println(str2+numA+numB);//Hard23
		System.out.println(str2+(numB-numA));//Hard1
		

/*Type a program to see “61 Study-1” as output on the console
by using “concatenation” operation.
 */
		
System.out.println((numA*numB)+""+(numB-numA)+" "+str1+(numA-numB));//61 Study-1”
	}

}
