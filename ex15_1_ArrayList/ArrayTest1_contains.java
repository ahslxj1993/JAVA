package ex15_1_ArrayList;
/*
 * ArrayList�� �ִ� ������ �˻��ϴ� ��
 * -indexOf(data) : ���ڿ� ���� ���� ���� ù��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * -lastIndexOf(data): ���ڿ� ���� ���� ���������� ������� �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * - ���ڿ� ���� ���� ������ -1�� ����
 * */


import java.util.ArrayList;

public class ArrayTest1_contains {
	public static void main (String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("��");
		list1.add("����");
		
		if (list1.contains("��")) {
			System.out.println("���� �����մϴ�");
		} else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
	}
}
