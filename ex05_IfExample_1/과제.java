package ex05_IfExample_1;

import java.util.Scanner;

public class ����{
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ �Է����ּ���");
		int score = sc.nextInt();
		
		/*if (score<0 || score>100) {
			System.out.println("�߸� �� �����Դϴ�.");
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
				
			
		//������ 5���� �������� ���̴ϱ� 5�� ������ ������ �����
		score = score/5;
			switch(score) {
			case 20:
			case 19:
				System.out.println("A+����"); break;
			case 18:
				System.out.println("A����"); break;
			case 17:
				System.out.println("B+����"); break;
					//.....
			}
			sc.close();
			}
			
			




}