package ex06_02_method;

import java.util.Scanner;

/*
 * 1.������ �Է¹޾� inputdata�� �����մϴ�
 * 2.abs(inputdata) ȣ���մϴ�
 * 3.abs(inputdata) �ż����� ��ȯ���� int�� �Դϴ�
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
		System.out.println("������ �Է��ϼ���");
		int inputdata = sc.nextInt();
		sc.close();
		System.out.println("���밪 : " + abs(inputdata));
	}

}
