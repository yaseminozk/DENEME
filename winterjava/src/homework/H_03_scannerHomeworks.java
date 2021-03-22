package homework;

import java.util.Scanner;




public class H_03_scannerHomeworks {

	public static void main(String[] args) {
	/*
	 Type a program which calculates the area and the perimeter 
	 of a square
whose side length is entered by user.
Hint 1: Area of a square is length x length
Hint 2: Perimeter of a square is 4x length
	 */
		
Scanner scanner = new Scanner(System.in);
System.out.println("Please Enter length" );
int length = scanner.nextInt();
System.out.println("Area of the square is: " + (length*length)
		+ " Perimeter of the square is: " + (length*4));

/*
 Type a program which calculates the cube of a number which 
 is entered
by user.
Hint 1: Cube of a number is a x a x a
 */
System.out.println("Please enter a number");
int num = scanner.nextInt();
System.out.println("Cube of a number is: " + (num*num*num));

/*
Type a program which calculates the area and the perimeter of a 
rectangle whose length and with are entered by user.
Hint 1: Area of a rectangle is width x length
Hint 2: Perimeter of a rectangle is 2x (width + length)
 */

System.out.println("Please enter a length");
int reclength = scanner.nextInt();
System.out.println("please enter a width");
int recwidth = scanner.nextInt();
System.out.println("Area of a rectangle is " + (recwidth*reclength));
System.out.println("Perimeter of a rectangle is " + (2*recwidth*reclength));

/*
 Type a program which calculates the volume of a rectangular 
 prism whose length, with, and height are entered by user.
Hint 1: Volume of a rectangular prism is width x length x height
 */

System.out.println("please enter length" );
int prismlength = scanner.nextInt();
System.out.println("please enter width");
int prisimwidth = scanner.nextInt();
System.out.println("please enter height");
int prisimheight = scanner.nextInt();
System.out.println("Volume of a rectangular prism is "+ (prisimheight*prisimwidth*prismlength));

/*
 Type a program which calculates the area and the perimeter of 
 a circle whose radius is entered by user. (Use float)
Hint 1: Take pi number as 3.14159
Hint 2: Area of a circle is 3.14159 x radius x radius
Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
Hint 4: To get float, use nextFloat()
 */

System.out.println("please enter the radius");
float radius = scanner.nextFloat();
System.out.println("Area of a circle is: " + (3.14159*radius*radius));
System.out.println("Perimeter of a circle is: " + (3.14159*radius*2));

/*
 Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use byte)
Hint 1: Perimeter of a triangle is a + b + c
Hint 4: To get byte, use nextByte()
 */

System.out.println("enter the first length");
byte a = scanner.nextByte();
System.out.println("enter the second length");
byte b = scanner.nextByte();
System.out.println("enter the third length");
byte c = scanner.nextByte();

System.out.println("Perimeter of a triangle is: " + (a+b+c));

/*
 *Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
 */

System.out.println("enter the mile");
double mile = scanner.nextDouble();
System.out.println(mile + " mile is equal to " + (mile*1.6) +" km.");


/*
 * Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()
 */
System.out.println("enter the hour");
long hour = scanner.nextLong();
System.out.println(hour*60*60);

/*
 * 9)Type a program which asks user to enter his/her first name and last name,
then print it on the console.
Hint: To get String, use nextLine()
 */
System.out.println("what is your first name?");
String fname = scanner.nextLine();
System.out.println("what is your last name?");
String lname = scanner.nextLine();
System.out.println("Your first and last name is: " + fname+" "+lname);


/*
 * Type a program which asks user to enter his/her full name, and address
then print them on the console like the full name should be in the first line,
and the address will be in the second line.
Hint: To get String, use nextLine()
 */

System.out.println("what is your full name");
String fullname = scanner.nextLine();
System.out.println("what is your address?");
String addressString = scanner.nextLine();
System.out.println(fullname+"\n"+addressString);
	}

}
