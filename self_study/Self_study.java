package self_study;

import java.util.Scanner;

public class Self_study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ele_length = sc.nextInt();

		int[] arr;
		arr = new int[ele_length];
		//배열의 길이
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//값들을 배열에 저장
		
		int max = arr[0];
		for (int i=1 ; i < arr.length ; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		//최대값
		
		int min = arr[0];
		for (int i=1; i<arr.length ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		//최소값
		
		System.out.println(min+" "+max);
		sc.close();
	}
}