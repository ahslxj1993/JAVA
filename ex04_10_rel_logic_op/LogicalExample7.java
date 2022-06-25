package ex04_10_rel_logic_op;

public class LogicalExample7 {
	public static void main(String args[]) {
		int a=20, b=20;
		
		if (a>=20 || ++b>=20) {//a>=20 이 참이므로 두번째 피연산자는 평가하지 않는다.
			System.out.println("참 : "+b);
			} else {
				System.out.println("거짓 : "+b);
			}
		System.out.println(b);
		System.out.println("=========================");
		
		a=10;  b=20;
		if (a>=20 || ++b>=20) {// a>=20 이 거짓이므로 두번째 피연산자는 평가한다.
			System.out.println("참 : "+b);
			} else {
				System.out.println("거짓 : "+b);
			}
		System.out.println(b);
	}
}
