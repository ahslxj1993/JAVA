package ex05_IfExample_1;

import java.util.Scanner;

public class 과제{
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();
		
		/*if (score<0 || score>100) {
			System.out.println("잘못 된 점수입니다.");
		} else {
			switch (score) {
			case 95:
				System.out.println("A+");
				break;
			case 90:
				System.out.println("A");
				break;
			case 85:
				System.out.println("B+");
				break;
			case 80:
				System.out.println("B");
				break;
			case 75:
				System.out.println("C+");
				break;
			case 70:
				System.out.println("C");
				break;
			case 65:
				System.out.println("D+");
				break;
			case 60:
				System.out.println("D");
				break;

			default:
				System.out.println("F");
				*/
				
			
		//점수가 5점씩 학점으로 묶이니까 5로 나눠서 몫값으로 묶어라
		score = score/5;
			switch(score) {
			case 20:
			case 19:
				System.out.println("A+학점"); break;
			case 18:
				System.out.println("A학점"); break;
			case 17:
				System.out.println("B+학점"); break;
					//.....
			}
			sc.close();
			}
			
			




}