package week4;

public class P_Q05_BreakContinue {

public static void main(String[] args) {
		
		int arr[]= {2,5,6,7,8,9,12};
		
	//Print the first three element of array
		for(int i=0;i<arr.length;i++) {
			if(i>2) {
				break;//to break loop
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
	//Print just last two elements
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-2) {
				continue;//to skip loop
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
	//Print the elements from index 2 to index4
		for(int i=0;i<arr.length;i++) {
			if(i<2) {
				continue;
			}
			if(i>4) {
				break;
			}
			System.out.print(arr[i]+" ");
		}

	}

}