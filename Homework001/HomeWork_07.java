package Homework001;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_07 {
	public static void main(String args[]) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		input(as);
		Student2.sort(as);
		print(as);

	}

	static void input(ArrayList<Student2> as) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			
			System.out.println("���� ������ �Է��ϼ���");
			int kor = isNumber(sc);
			
			System.out.println("���� ������ �Է��ϼ���");
			int math = isNumber(sc);
			
			System.out.println("���� ������ �Է��ϼ���");
			int eng = isNumber(sc);
			
			Student2 e = new Student2(name, kor, math, eng);
			as.add(e);
			 
 			
			System.out.println("��� �Է��Ͻðڽ��ϱ� (q�Ǵ�Q �Է½� ���� �׿ܴ� ���)");
			String quit = sc.nextLine();
			
			
			
			if (quit.equals("q") || quit.equals("Q"))
				break;
		}

		/*
		 * static void input (ArrayList<Student2> as){
		 * String quit = "";
		 * String name;
		 * int kor, eng, math;
		 * Scanner sc = new Scanner(System.in);
		 * while(!pandan.equalsIgnoreCase("q")){
		 * System.out.println("�̸��� �Է��ϼ���");
		 * String name = sc.nextLine();
		 * 
		 * System.out.println("���� ������ �Է��ϼ���");
		 * int kor = isNumber(sc);
		 * 
		 * System.out.println("���� ������ �Է��ϼ���");
		 * int math = isNumber(sc);
		 * 
		 * System.out.println("���� ������ �Է��ϼ���");
		 * int eng = isNumber(sc);
		 * 
		 * Student2 e = new Student2(name,kor,math,eng);
		 * as.add(e);
		 * 
		 * System.out.println("��� �Է��Ͻðڽ��ϱ� (q�Ǵ�Q �Է½� ���� �׿ܴ� ���)");
		 * String quit =sc.nextLine();
		 * }
		 * sc.close();
		 * }
		 */
	}

	static void print(ArrayList<Student2> as) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (int cnt = 0; cnt < as.size(); cnt++) {
			System.out.println(as.get(cnt));
		}
	}

	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
		}
		return num;
	}
}