package ex05;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input_실습 {
	public static void main (String args[]) {
		InputStream is = System.in;
		
		Scanner sc = new Scanner (is);
		
		int a,b, result;
		
		System.out.println("정수 a 를 입력하세요 > ");
		a= sc.nextInt();
		
		System.out.println("정수 b 를 입력하세요 > ");
		b = sc.nextInt();
		
		result=a+b;
		System.out.printf("%-5d + %5d = %5d%n",a,b,result );
		
		result=a-b;
		System.out.printf("%-5d - %5d = %5d\n",a,b,result );
		
		result=a*b;
		System.out.printf("%-5d * %5d = %5d\n",a,b,result );
		
		result =a/b;
		System.out.printf("%-5.2f / %5.2f = %5.2f%n",
				(double)a,(double)b,(double)result );
		
		result=a%b;
		System.out.printf("%-5d %% %5d = %5d\n",a,b,result );
		
		sc.close();
	}
}
