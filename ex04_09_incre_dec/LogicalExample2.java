package ex04_09_incre_dec;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {
	public static void main(String args[]) {
		InputStream input = System.in;
		Scanner sc = new Scanner(input);
		int num;
		
		System.out.println("���� �Է��ϼ���");
		num = sc.nextInt();
		
		if (!(1<=num && num<=10)) {
			System.out.println("(!)1~10 ������ ���� �ƴմϴ�.");
		} else {
			System.out.println("1~10 ������ �� �Դϴ�.");
		}
		
		sc.close();
	}
}
