package day17arraylists;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists03 {
	
	/*
	 How to remove repeted element from a list
	 INTERVIEW QUESTION
	 */

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('y');
		list1.add('x');
		list1.add('y');
		list1.add('x');
		list1.add('z');
		list1.add('m');
		
		List<Character> list2 = new ArrayList<>();
		
		for (int i = 0; i < args.length; i++) {
			if (! list2.contains(list1.get(i))) {
				list2.add(list1.get(i));
			}
		}
		System.out.println(list2);
	}

}
