package ex06_01_array;

import java.util.Scanner;

public class arraytest02 {
	public static void main(String args[]) {
		int sum = 0;
		double avg = 0;
		int[] score = new int[5];
		
		System.out.println("���� 5��");
		Scanner sc = new Scanner(System.in);
		
		for (int i =0 ; i<score.length ; i++) {
			score[i] = sc.nextInt();
			sum+= score[i];
		}
		
		avg= (double) sum/(score.length);
		System.out.println("�� = "+sum+"\n��� = "+avg);
		
		sc.close();
	}
}
