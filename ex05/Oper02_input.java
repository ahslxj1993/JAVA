package ex05;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
		InputStream is = System.in;
		
		//java.util.Scannser.Scanner(InputStrea source)
		//클래스명	참조형	변수	연산자	생성자 호출
		Scanner	sc		=	new		Scanner(is);
		
		//콘솔에서 "정수를 입력하세요 > " 다음에 커서를 위치하고 숫자 입력 후 엔터
		System.out.print("정수를 입력하세요 > ");
		int a = sc.nextInt();//정수를 읽어 변수 a 에 저장합니다.
		System.out.println("입력값은 "+a+"입니다.");
		
		System.out.print("정수를 입력하세요 > ");
		int b = sc.nextInt();//정수를 읽어 변수 b 에 저장합니다.
		System.out.println("입력값은 "+b+"입니다.");
				
		
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
