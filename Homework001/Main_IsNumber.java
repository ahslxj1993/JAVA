//    isNumber : �Է¹��� �����Ͱ� ���ڰ� �ƴϸ� ���ڸ� �Է� ���� ������ ���� �ݺ��ϸ�
//                  ������ ��쿡 �ݺ����� ����ϴ�.

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
				num = Integer.parseInt(sc.nextLine()); //���ڿ��� ���ڷ� �ٲ�ߵǴµ�
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
		}
		return num;
	}

}
