package ex04_09_incre_dec;

import java.io.InputStream;
import java.util.Scanner;

public class LocalExample4 {
	public static void main(String [] args) {
		InputStream input = System.in;
		Scanner sc = new Scanner(input);
		int num;
		
		System.out.println("수를 입력해주세요");
		num = sc.nextInt();
		
		if (num==1 || num ==11) {
			System.out.println("num은 1또는 11입니다.");
		} else {
			System.out.println("num은 1또는 11이 아닙니다.");
		}
		
		sc.close();
		
	}
}
