package ex03_3_Constant;
//상수 : 값을 한번만 저장할수있는 공간
//상수 만드는법 : 변수타입 앞에 키워드 final만 붙여주기만 하면 됩니다
//일반적으로 상수의 이름은 대문자로 사용합니다.
//상수는 한번 설정하고 어디서든 똑같은 값을 사용하기 위해 사용합니다.

public class Const {
	public static void main(String args[]) {
		final int MAX = 500;
		System.out.println(MAX);
		
		//정수형 변수
		int age = 30;
		age = 21;
		System.out.println(age);
	}
}
