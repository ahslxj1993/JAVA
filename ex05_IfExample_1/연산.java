package ex05_IfExample_1;

import java.util.Scanner;

public class 연산 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);		
	
		System.out.println("정수1을 입력해주세요");
		int num1 = sc.nextInt();
		
		System.out.println("정수2를 입력해주세요");
		int num2= sc.nextInt();
		
		System.out.println("연산자 +,-,*,/,% 중 한개를 입력해주세요");
		String ch = sc.next();
		
		switch(ch) {
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
			case "/":
				System.out.println(num1+"/"+num2+"="+((float)num1/(float)num2)); break;
			case "%":
				System.out.println(num1+"%"+num2+"="+(num1%num2)); break;
			default:
				System.out.println("정확한 연산자를 입력하세요");
			
			}
		sc.close();
	}
}
