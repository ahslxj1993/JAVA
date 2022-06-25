package ex07_08_private_field;


public class FieldExample2 {
	public static void main(String[] args) {
		Circle2 i = new Circle2(3.5);
		double area = i.getArea();
		
		System.out.println("원의 반지름 : "+i.getRadius());
		System.out.println("원의 넓이 : "+area);
		
		System.out.println();
		
		i.setRadius(10.5);
		area=i.getArea();
		System.out.println("원의 반지름 : "+i.getRadius());
		System.out.println("원의 넓이 : "+area);
	}
	
}
