package day11whileLoopDwhileLoop;

public class DoWhileLoop01 {

	public static void main(String[] args) {
	
		//While loop: Condition is checked first then if it is true loop 
		// body runs. If it is false it breaks. IN WHILE LOOP IT IS POSSIBLE TO 
		//THE LOOP BODY not to run.
		/*
		 DOWHILE LOOP in the do while loop, loop body runs at least once.Because
		 it checks the condition at the end
		 */
		
		int i = 1;
		while (i>1) {
			System.out.println("this is while loop");
			i--;
		}
		do {
			System.out.println("this is do while loop");
			i--;
		} while (i>1);
	}

}
