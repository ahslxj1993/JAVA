package ex07_06_constructor_call;

public class FieldExample1 {
	public static void main(String[] args) {
		Circle i = new Circle(3.5);
		printradius_area(i);
		
		i.radius = 5.5;
		printradius_area(i);
	}
	
	public static void printradius_area(Circle i) {
		double area = i.getArea();
		System.out.println("원의 반지름 : "+i.radius);
		System.out.println("원의 넓이 : "+area);
	}

}
