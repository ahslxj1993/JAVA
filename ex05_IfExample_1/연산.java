package ex05_IfExample_1;

import java.util.Scanner;

public class ���� {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);		
	
		System.out.println("����1�� �Է����ּ���");
		int num1 = sc.nextInt();
		
		System.out.println("����2�� �Է����ּ���");
		int num2= sc.nextInt();
		
		System.out.println("������ +,-,*,/,% �� �Ѱ��� �Է����ּ���");
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
				System.out.println("��Ȯ�� �����ڸ� �Է��ϼ���");
			
			}
		sc.close();
	}
}
