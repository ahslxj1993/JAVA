package self_study;

import java.util.Scanner;

public class Self_study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ele_length = sc.nextInt();

		int[] arr;
		arr = new int[ele_length];
		//�迭�� ����
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//������ �迭�� ����
		
		int max = arr[0];
		for (int i=1 ; i < arr.length ; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		//�ִ밪
		
		int min = arr[0];
		for (int i=1; i<arr.length ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		//�ּҰ�
		
		System.out.println(min+" "+max);
		sc.close();
	}
}