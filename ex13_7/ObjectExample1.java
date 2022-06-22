package ex13_7;

public class ObjectExample1 {
	public static void main (String [] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1.equals(obj2)) { 
			System.out.println("obj1. equals(obj2) : 같음");
		}
		else {
			System.out.println("obj1. equals(obj2) : 다름");
		}
		
		if(obj1==obj2) {
			System.out.println("obj1 == obj2 : 같음");
		}
		else {
			System.out.println("obj1 == obj2 : 다름");
		}
	}
}
