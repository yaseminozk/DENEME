package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class PassByValuePassByReference {
//INTERVIEW QUESTION
	public static void main(String[] args) {
		
		//int price = 100;
		//System.out.println(discount(price));//90
		//System.out.println(price);//100
		
		//String str = "Java";
		//System.out.println(concatenate(str));//JavaX
		//System.out.println(str);
		
		List<Integer>list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		
		System.out.println(updateAllElements(list));//
		System.out.println(list);//

	}
	public static int discount(int price) {
		price = price-10;
		return price;
	}
	public static String concatenate(String str) {
		str = str + "X";
		return str;
		
	}
	public static List<Integer> updateAllElements(List<Integer>list() {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
	}

}
