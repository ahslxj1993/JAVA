package Homework001;

import java.util.Scanner;

public class Main_Scanner {
	public static void main (String [ ]args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("��°�� : "+name);
		System.out.println("name ���� : "+name.length());
		sc.close();
	}
}
