package ex13_1_Object_toString;

public class ObjectExample2 {
	public static void main (String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.println(); �Ǵ� System.out.print() �޼ҵ忡
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� toString() �޼ҵ尡 ȣ��˴ϴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	} 
}
