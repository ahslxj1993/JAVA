package ex04_10_rel_logic_op;
//-단락평가(short circuit evaluation)
//1. &&연산의 경우 첫번째 피연산자를 평가해서 false인경우
//	두번째 피연산자를 평가하지 않고 false를 반환합니다
//2. || 연산의 경우 첫번째 피연산자를 평가해서 true인 경우
//	두번째 피연산자를 평가하지 않고 true를 반환합니다


public class LogicalExample6 {
	public static void main(String args[]) {
		int a=20, b=20;
		
		if (a>=20 && ++b>=20) {//a>=20 참이기에 ++b>=20 연산함
			System.out.println("참 : "+b);
			} else {
				System.out.println("거짓 : "+b);
			}
		System.out.println(b);
		System.out.println("=========================");
		
		a=10;  b=20;
		if (a>=20 && ++b>=20) {//a>=20 거짓이기에 ++b>=20 연산안함
			System.out.println("참 : "+b);
			} else {
				System.out.println("거짓 : "+b);
			}
		System.out.println(b);
	}
}
