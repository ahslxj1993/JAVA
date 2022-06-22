package ex13_9_Object_getClass_1;
public class ObjectExample {
	public static void main (String[] args) {
		Point p = new Point(5,10);
		
		//Class 객체를 얻는 방법
		//1. 생성된 객체로부터 얻는 방법
		Class c1 = p.getClass();
		
		//2. 클래스 리터럴(.class)로부터 얻는 방법
		Class c2 = Point.class;
		
		//3. 클래스 이름으로부터 얻는 방법 - throws ClassNotFoundException
		Class c3 =null;
		try {					//매개변수에 패키지명.클래스명을 사용합니다
			c3 = Class.forName("ex13_9_Object_getClass_1.Point");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);
		
		//패키지명.클래스명
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		//접근제어자 class 패키지명.클래스명
		System.out.println(c1.toGenericString());
		System.out.println(c2.toGenericString());
		System.out.println(c3.toGenericString());
	}
}
