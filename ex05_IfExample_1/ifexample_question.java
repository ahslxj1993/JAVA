package ex05_IfExample_1;

import java.util.Scanner;

public class ifexample_question {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
				
		int num;
		
		System.out.println("num ���� �Է��ϼ���");
		num= sc.nextInt();
		
		if(num<10) {
			System.out.println("num�� 10 �̸��Դϴ�.");
		}else if(num>=10 && num<100) {
				System.out.println("num�� 100 �̸��Դϴ�.");
		}
		
		
		sc.close();
	}
}
