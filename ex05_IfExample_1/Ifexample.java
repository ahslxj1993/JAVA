package ex05_IfExample_1;

public class Ifexample {
	public static void main(String args[]) {
		int num1=52;
		int num2=24;
		int num3=32;
		
		if (num1>num2) {
			if (num1>num3)
				System.out.println("num1 이 제일 큽니다.");
		}
		//위 문장을 한개의 if 문과 &&연산자로 바꾸면?
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 이 제일 큽니다");
		}
			
		System.out.println("끝");
		
	}
}
