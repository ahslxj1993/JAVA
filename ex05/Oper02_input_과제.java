package ex05;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input_���� {
	public static void main(String[]args) {
		InputStream is = System.in;
		
		Scanner sc = new Scanner(is);
		
		int number;
		double sight_left, sight_right;
		char alphabet = 0;
		String name,food,workout;
		boolean song;
		
		System.out.println("�̸�");
		name= sc.nextLine();
		
		System.out.println("�����ϴ¼���");
		number = sc.nextInt();
		
		System.out.println("��,�� �÷� ���ʴ�� �Է�");
		sight_left = sc.nextDouble();
		sight_right = sc.nextDouble();
		
		System.out.println("�����ϴ� ����");
		sc.nextLine();
		food=sc.nextLine();
		
		System.out.println("�����ϴ� �");
		workout=sc.nextLine();

		System.out.println("�����ϴ� ���ĺ�");
		alphabet = sc.next().charAt(0);
		
		System.out.println("����� �뷡�� �����ϳ���?(true, false)");
		song = sc.nextBoolean();
		
		
		

		System.out.println("\n\n�̸�: "+name);
		System.out.println("�����ϴ¼���: "+number);
		System.out.println("�����÷�: "+sight_left);
		System.out.println("�����÷�: "+sight_right);
		System.out.println("�����ϴ� ����: "+food);
		System.out.println("�����ϴ� �: "+workout);
		System.out.println("�����ϴ� ���ĺ�: "+alphabet);
		System.out.println("�뷡�� �����ϳ���?: "+song);
		
		
		sc.close();
	}

}
