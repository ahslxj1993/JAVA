package ex08_00_inheritance;

public class Child extends Parent {
	void printName() {
		System.out.println(name);
	}
	
	void printAge() {
		System.out.println(age);
	}
	
	public void setAge(int age) {
		this.age = age-10;
	}
}