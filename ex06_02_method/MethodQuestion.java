package ex06_02_method;

/*
 * 1. 메서드 이름 : add
 *  매개변수 : 정수형 2개
 *  기능 : 매개변수의 값을 더한다
 *  반환값: 매개변수의 값을 더한다
 *  반환형: int
 *  
 *  2. 1번에서 정의한 add 메서드를 호출합니다
 *  인자값으로 3과 4를 사용합니다
 *
 */

public class MethodQuestion {
	public static int add(int i, int j) {
		int sum;
		sum = i + j;
		return sum;
		// 위의 세줄을 
		//return i+j; 로 하면 더 간결하다.
	}

	public static void main(String args[]) {
		System.out.println(add(3, 4));
	}

}
