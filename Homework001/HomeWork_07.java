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
			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			
			System.out.println("국어 점수를 입력하세요");
			int kor = isNumber(sc);
			
			System.out.println("수학 점수를 입력하세요");
			int math = isNumber(sc);
			
			System.out.println("영어 점수를 입력하세요");
			int eng = isNumber(sc);
			
			Student2 e = new Student2(name, kor, math, eng);
			as.add(e);
			 
 			
			System.out.println("계속 입력하시겠습니까 (q또는Q 입력시 종료 그외는 계속)");
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
		 * System.out.println("이름을 입력하세요");
		 * String name = sc.nextLine();
		 * 
		 * System.out.println("국어 점수를 입력하세요");
		 * int kor = isNumber(sc);
		 * 
		 * System.out.println("수학 점수를 입력하세요");
		 * int math = isNumber(sc);
		 * 
		 * System.out.println("영어 점수를 입력하세요");
		 * int eng = isNumber(sc);
		 * 
		 * Student2 e = new Student2(name,kor,math,eng);
		 * as.add(e);
		 * 
		 * System.out.println("계속 입력하시겠습니까 (q또는Q 입력시 종료 그외는 계속)");
		 * String quit =sc.nextLine();
		 * }
		 * sc.close();
		 * }
		 */
	}

	static void print(ArrayList<Student2> as) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
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
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return num;
	}
}