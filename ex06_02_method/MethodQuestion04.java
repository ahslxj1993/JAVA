package ex06_02_method;

import java.util.Scanner;

public class MethodQuestion04 {
	public static void main(String args[]) {
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���");

		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();

		int [] result = max_min(data);

		System.out.println("�ִ밪 : " + result[0]);
		System.out.println("�ּҰ� : " + result[1]);
		sc.close();
	}
	
	public static int[] max_min(int i[]) {
		
		int max_and_min [] = {i[0],i[0]};
		
		for (int j = 1 ;j<i.length; j ++) {
			if (max_and_min[0]<i[j]) max_and_min[0] = i[j]; //max
			if (max_and_min[1]>i[j]) max_and_min[1] = i[j]; //min
		}
		return max_and_min;
	}

}
