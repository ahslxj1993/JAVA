package ex05_IfExample_1;

import java.util.Scanner;

public class 학점구하기 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s;
		
		System.out.println("점수를 입력해주세요");
		s = sc.nextInt();
		
		if (s>=95) {
			System.out.println("A+");
			} else if (s>=90) {
				System.out.println("A");
			}
		sc.close();
	}
}
