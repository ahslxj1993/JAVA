package ex05_IfExample_1;

import java.util.Scanner;

public class ifexample_question {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
				
		int num;
		
		System.out.println("num 값을 입력하세요");
		num= sc.nextInt();
		
		if(num<10) {
			System.out.println("num은 10 미만입니다.");
		}else if(num>=10 && num<100) {
				System.out.println("num은 100 미만입니다.");
		}
		
		
		sc.close();
	}
}
