package ex14_1_Wrapper;

public class Wrapper1_boxing_unboxing {
	public static void main(String args[]) {
		
		//교재 351페이지
		Integer obj = new Integer(12); //자바 jdk 1.9부터 deprecated
		
		//Wrapper 클래스의 생성자를 대신하는 정적 메소드를 이용해서 객체생성 합니다.
		//박싱 - 기본형 타입의 값을 객체로 변환
		//int - Integer
		Integer obj1 = Integer.valueOf(12);
		Integer obj2 = Integer.valueOf(7);
		
		//언박싱 - 객체를 기본형 타입의 값으로 변환
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue();
		int sum= n1+n2;
		System.out.println(sum);
		
		//String -> Integer
		Integer n02 = Integer.valueOf("20a"); //이건 박싱은 아닙니다
											//"20"은 문자열로 기본형이 아닙니다.
		
		//Integer -> int
		int n3 = n02.intValue(); //언박싱 이루어짐, 이것으로 형변환이 이루어집니다.
		sum = n1 + n2+ n3;
		System.out.println(sum);
		
	}
}
