
package day20passbyvaluepassbyreferencedate;
public class Varargs01 {
	/*
	 1)If you want a method to run with different number of arguments use varargs
	 2)varargs behaves like lists but behind the varargs arrays work
	 3)To declare a varargs use "int... a" or "string... s" etc
	 4)varargs must be the parameter inside the method parenthesis
	 */
    public static void main(String[] args) {
        
        System.out.println(add(-2, 17));
    }
    
    public static int add(int... a) {
        
        int sum = 0;
        
        for(int w : a) {
            sum = sum + w;
        }
        
        return sum;
    }
}
