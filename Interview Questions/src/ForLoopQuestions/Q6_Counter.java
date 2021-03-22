package ForLoopQuestions;

import java.util.Scanner;

public class Q6_Counter {

	public static void main(String[] args) {
		getword();
	
	
	

	}
	public static String getword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String word = scan.next().toLowerCase();
		//aaaayssseeee
		int count =1;
		String container= "";
		
		for (int i = 0; i < word.length()-1; i++) {
			if (word.charAt(i)==word.charAt(+1)) {
				count++;
				continue;
			}else {
				container=container+word.charAt(i)+count;
			}
			
		}
	}

}
