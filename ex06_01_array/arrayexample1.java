package ex06_01_array;

public class arrayexample1 {
	public static void main(String args[]) {
		int [] arr;
		arr = new int[10];
		
		arr[0]= 10;
		arr[1]=20;
		arr[2]=arr[0]+arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		
		try{
			System.out.println(arr[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
