package self_study;

import java.util.Scanner;

public class Self_study02 {
	public static void main (String [] args) {
		int arr [];
		arr = new int [9];
		
		Scanner sc = new Scanner(System.in);
		for(int number=0; number<arr.length ; number++) {
			arr[number] = sc.nextInt();
		}
		
		int max = arr[0];
		int index = 0 ;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i+1;
				}
		}
		
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
