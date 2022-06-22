package ex08_00_inheritance;

public class Example {
	public static void main (String args[]) {
		Child child = new Child();
		child.printName();
		child.printAge();
		
		child.setAge(30);
		child.printAge();
	}
}

