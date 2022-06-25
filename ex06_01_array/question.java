package ex06_01_array;

import java.util.Scanner;

public class question {

	// 1.
	/*
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int inputdata = sc.nextInt();
		int output = inputdata / 10;
		System.out.println(output);
		sc.close();
	*/
		
	//2.
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data");
		int inputdata = sc.nextInt();
		int output = (inputdata -1) / 10;
		System.out.println(output);
		sc.close();
	}
}
