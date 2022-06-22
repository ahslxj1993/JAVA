package ex06_02_method;

import java.util.Scanner;

/*
 * 1.정수를 입력받아 inputdata에 저장합니다
 * 2.abs(inputdata) 호출합니다
 * 3.abs(inputdata) 매서드의 반환형은 int형 입니다
 * 
 */

public class MethodQuestion02 {
	public static int abs(int i) {
		if (i < 0) {
			i = i * -1;
		}
		return i;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int inputdata = sc.nextInt();
		sc.close();
		System.out.println("절대값 : " + abs(inputdata));
	}

}
