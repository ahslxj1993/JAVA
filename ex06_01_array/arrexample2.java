package ex06_01_array;

public class arrexample2 {
	public static void main(String args[]) {
		int arr[];
		arr = new int [10];
		
		for (int i=0 ; i<10 ;i++) {
			System.out.println("arr ["+i+"] = "+ arr[i]);
		}
		System.out.println("==============================================");
		
		for (int i=0 ; i<arr.length ; i++) {
			System.out.println("arr ["+i+"] = "+ arr[i]);
		}
	}
}
