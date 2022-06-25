package Homework001;

import java.util.*;

public class Homework_02 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year); //�Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, month); //�Է¹��� ���� ����
		cal.set(year,month-1,1); //�Է¹��� ��, ���� 1�Ϸ� ����

		System.out.println("			"+year+"�� "+month+"��");
		System.out.println("	��	��	ȭ	��	��	��	��");
		System.out.println("================================================================");

		
		int end = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)
		

		for(int i=1; i<=end; i++) {//1�Ϻ��� �ش� ���� ������ ��¥���� �ݺ���
			if(i==1) {//1�� �϶� �տ� ���ϼ� ��ŭ�� ������ �����
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("	");
				}//dayOfWeek�� �ش� ��¥�� ����(����)�� ���� �׸�ŭ ������ �ټ� �ִ�. 
			}
			System.out.print("	"+i); // 1�Ϻ��� �ش� ���� ������ ��¥���� ������ �ְ� ���
			if(dayOfWeek%7==0) { //������̸� �ٹٲ�
				System.out.println();
			}
			dayOfWeek++;//������ 1~7���� 1�� �����ϴ� ������ �ݺ���
		}
		sc.close();
	} //main
}

