package ex05;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		//System.in�� Ű����� �����͸� �Է� ������ ����մϴ�.
		InputStream is = System.in;
		
		//java.util.Scannser.Scanner(InputStrea source)
		//Ŭ������	������	����	������	������ ȣ��
		Scanner	sc		=	new		Scanner(is);
		
		//�ֿܼ��� "������ �Է��ϼ��� > " ������ Ŀ���� ��ġ�ϰ� ���� �Է� �� ����
		System.out.print("������ �Է��ϼ��� > ");
		int a = sc.nextInt();//������ �о� ���� a �� �����մϴ�.
		System.out.println("�Է°��� "+a+"�Դϴ�.");
		
		System.out.print("������ �Է��ϼ��� > ");
		int b = sc.nextInt();//������ �о� ���� b �� �����մϴ�.
		System.out.println("�Է°��� "+b+"�Դϴ�.");
				
		
		int c1=a+b;
		System.out.println("a"+"+"+"b"+"="+c1);
		int c2=a-b;
		System.out.println("a"+"-"+"b"+"="+c2);
		int c3=a*b;
		System.out.println("a"+"*"+"b"+"="+c3);
		int c4=a/b;
		System.out.println("a"+"/"+"b"+"="+c4);
		int c5=a%b;
		System.out.println("a"+"%"+"b"+"="+c5);
		
		sc.close();
		
		
		

	}
}
