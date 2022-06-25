//    isNumber : 입력받은 데이터가 숫자가 아니면 숫자를 입력 받을 때까지 무한 반복하며
//                  숫자인 경우에 반복문을 벗어납니다.

package Homework001;

import java.util.Scanner;

public class Main_IsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu = isNumber(sc);
		System.out.println(jumsu);
		sc.close();

	}

	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine()); //문자열을 숫자로 바꿔야되는데
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return num;
	}

}
