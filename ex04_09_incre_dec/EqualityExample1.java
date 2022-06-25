package ex04_09_incre_dec;

public class EqualityExample1 {
	public static void main(String args[]) {
		int num1 =6;
		int num2 = 2+3;
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		if (num1==num2) {
			System.out.println("num1과 num2의 값은 같습니다.");
		}
		
		if (num1!=num2) {
			System.out.println("num1과 num2의 값은 같지 않습니다.");
		}
	}
}
