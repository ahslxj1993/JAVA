package ex13_1_Object_toString;

public class ObjectExample2 {
	public static void main (String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.println(); 또는 System.out.print() 메소드에
		//문자열이 아닌 객체를 넘겨주면 toString() 메소드가 호출됩니다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	} 
}
