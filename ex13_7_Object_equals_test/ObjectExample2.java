package ex13_7_Object_equals_test;

public class ObjectExample2 {
	public static void main (String [] args) {
		Rectangle obj1 = new Rectangle(10,20);
		
		Rectangle obj2 = (Rectangle) obj1.clone();
	}
}
