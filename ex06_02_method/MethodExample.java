package ex06_02_method;

public class MethodExample {

	// 접근제어자 		객체생성 없이 접근가능	반환되는값의 자료형			메서드이름(매개변수 목록)
	public 			static 				void 					main(String args[]) {
		int num = 50;
		char data = '*';
		// num 변수가 가지고 있는 값을 print() 메서드 안에서 출력하려면 어떻게 해야 할까요?
		print(data, num); // 메서드의 괄호안에 값을 넣어주면 됩니다.
		// 메서드를 정의한 곳에서 num 값을 저장하기 위한 변수를 선언해 주어야 합니다,
		// 호출하는 메서드에서 사용한 num의 값을 인자라고 하며
		// 메서드 정의에 사용된 parameter를 매개변수 라고 합니다.
		stars(num, data);
		return; // 여기서 main() 메서드를 종료합니다.
	}

	// 메서드 정의 //parameter는 매개변수(이름이 바뀌어도 상관없음)
	public static void print(char parameter, int parameter2) {
		System.out.println("print() 메서드 입니다.");
		System.out.println("main() 메서드에서 전달받은 데이터의 값은 " + parameter + "," + parameter2 + " 입니다.");
	}

	public static void stars(int par_num, char parameter) {
		for (int i = 0; i < 51; i++) {
			System.out.print(parameter);
		}
		return; // 반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능합니다.
	}

}
