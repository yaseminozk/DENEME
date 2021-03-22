package ForLoopQuestions;

public class Q5_HowtoGetInitial {
//How to get initials like JFK
	
	public static void main(String[] args) {
		String nameString;
		boolean init = true;
		nameString = "John Fitzgerald Kennedy";
		for (int i = 0; i < args.length; i++) {
			if(init) {
				System.out.println(nameString.charAt(i));
			}if (nameString.charAt(i) ==' ') {
				init = true;
			}else {
				init=false;
			}
		}

	}

}
