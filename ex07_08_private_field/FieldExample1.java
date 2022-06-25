package ex07_08_private_field;

public class FieldExample1 {
	public static void main(String[] args) {
		Circle2 i = new Circle2(3.5);
		printradius_area(i);
		
		//i.radius = 5.5;
		printradius_area(i);
	}
	
	public static void printradius_area(Circle2 i) {
		double area = i.getArea();
		//System.out.println("원의 반지름 : "+i.radius);
		System.out.println("원의 넓이 : "+area);
	}

}
