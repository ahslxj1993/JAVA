package ex06_01_array;

import java.util.Scanner;

public class stringarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int index = -1;
		String names[] = { "ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿" };
		System.out.println("�˻��� �̸��� �Է��ϼ���");

		System.out.print("�̸�:");
		String inputname = sc.next();
		
		for (int i=0 ;i<names.length;i++) {
			if (inputname.equals(names[i])) {
				index =i; break;
			} 
		}
		
		if (index != -1)
			System.out.println(inputname +"�� �迭�� �ε���"+index+"���� ã�ҽ��ϴ�.");
		else
			System.out.println(inputname+"�� �迭�濡�� ã�� ���߽��ϴ�.");
		sc.close();
	}

}
