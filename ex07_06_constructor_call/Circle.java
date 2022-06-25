package ex07_06_constructor_call;

public class Circle {
	double radius;
	final double PI = 3.14;
	
	public Circle (double radius){
		this.radius=radius;
	}
	
	double getArea() {
		double area=radius*radius*PI;
		return area;
	}
}
