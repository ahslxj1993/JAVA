package ex04_09_incre_dec;

import java.io.InputStream;
import java.util.Scanner;

public class LocalExample4 {
	public static void main(String [] args) {
		InputStream input = System.in;
		Scanner sc = new Scanner(input);
		int num;
		
		System.out.println("���� �Է����ּ���");
		num = sc.nextInt();
		
		if (num==1 || num ==11) {
			System.out.println("num�� 1�Ǵ� 11�Դϴ�.");
		} else {
			System.out.println("num�� 1�Ǵ� 11�� �ƴմϴ�.");
		}
		
		sc.close();
		
	}
}
