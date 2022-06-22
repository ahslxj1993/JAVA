package ex06_02_method;

import java.util.Scanner;

public class MethodQuestion03 {
	public static int max(int i, int j) {
		if(i>j) {
			return i;
		} else
			return j;
	}
	
	public static int min(int i, int j) {
		if (i<j) {
			return i;
		} else
			return j;
	}
	
	
	public static void main (String [] args) {
		int n1, n2, max2, min2;
		System.out.println("두개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		sc.close();
		//max2는 변수, max(n1,n2)의 max 는 메소드 이름
		max2 = max(n1,n2);
		min2 = min(n1,n2);
		System.out.println("max = "+max2);
		System.out.println("min = "+min2);
		
	}
}
