package homework;

import java.util.Scanner;

public class H_09_NestedTernaryAndSwitch {

	public static void main(String[] args) {
	/*
	 Type java code by using nested ternary.
Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
	 */
Scanner scanner = new Scanner(System.in);
System.out.println("enter a year");
int year = scanner.nextInt();

System.out.println((year%100==0?year%400==0?"it is a leap year":"it is not a leap year":year%4==0?"It is leap year":
	"It is not leap year"));
/*
 If the user pressed 1, 2, 3 the program will print the number that is pressed;
otherwise, program will print "Not allowed".
 */
System.out.println("enter 1 or 2 or 3");
int numguess = scanner.nextInt();

switch (numguess) {
case 1:
	System.out.println("1");
	break;
case 2:
	System.out.println("2");
	break;
case 3:
	System.out.println("3");
	break;

default:
	System.out.println("Not allowed");
	break;
}

/*
 Write a Java program user will choose answer among A, B, C, or D.
If the answer is true, output will be “True.” If the answer is false, output will be
“False”. Correct answer is ‘C’ for the multiple option question.
 */
Scanner scan = new Scanner(System.in);
System.out.println("pick one of these letter options A/B/C/D");
String choise = scan.next().toUpperCase();

switch (choise) {
case "A":
	System.out.println("false");
	break;
case "B":
	System.out.println("false");
	break;
case "C":
	System.out.println("true");
	break;
case "D":
	System.out.println("false");
	break;
default:
	break;
}

/*
 Type java code by using switch statement.
A school has following rules for grading system:
1. For 50 - C 2. For 80 - B. 4. For 100 - A
Ask user to enter marks and print the corresponding grade.
 */

System.out.println("enter your mark among 50-80-100 to see your grade");
int mark = scanner.nextInt();

switch (mark) {
case 50:
	System.out.println("C");
	break;
case 80:
	System.out.println("B");
	break;
case 100:
	System.out.println("A");
	break;

default:
	break;
}

/*
 Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
Then type a program by using “switch statement” to print “United” for ‘U’
”States” for ’S’, and “America” for ‘A’
 */

System.out.println("enter a letter among A/S/U to see what is stands for");
String letter = scan.next().toUpperCase();

switch (letter) {
case "U":
	System.out.println("United");
	break;
case "S":
	System.out.println("States");
	break;
case "A":
	System.out.println("America");
	break;
default:
	break;
}
	}

}
