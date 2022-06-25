package ex08_13_02_polymorphism_error;

public class InheritanceExample8 {
	public static void main (String args[]) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다","고객센터","admin@dukeeshop.co.kr","10%할인 쿠폰이 발행되었습니다.");
		
		SMSSender obj2  = new SMSSender("생일을 축하합니다","고객센터","02-0000-0000","10%할인 쿠폰이 발행되었습니다.");
		
		//서브클래스 객체 obj1, obj2를 가지고 메소드를 호출
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");
	}
	
		/*
		 * 1. MessageSender obj : 수퍼 클래스 타입의 파라미터
		 * 
		 * 2. MessageSender 클래스에서 SendMessage 메서드를 주석 처리할 경우 에러 발생합니다
		 * 
		 * 3.자바 컴파일러는 변수의 타입으로 그 메서드가 있는지 없는지 체크합니다.
		 * MessageSender에 sendMessage()메서드가 존재하지 않아서
		 * the method sendMessage(String) ins undefined for the type
		 * 에러발생 했습니다
		 * 
		 * 4.자바 가상 기계(JVM)는 객체의 메서드를 호출 할때 변수의 타입에 상관 없이
		 * 객체가 속하는 클래스의 메소드를 호출합니다.
		 */
		static void send(MessageSender obj , String recipent) {
			obj.sendMessage(recipent);
		}
}
