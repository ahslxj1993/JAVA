package ex13_8_clone_1;

public class ObjectExample2 {
	public static void main (String [] args) {
		//객체 생성
		Rectangle obj1 = new Rectangle(10,20);
		//clone 메서드로 객체를 복제
		Rectangle obj2 = (Rectangle) obj1.clone();
		
		//원본 객체와 복체 객체의 값을 출력
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.height = 100; obj1.width = 200;
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
