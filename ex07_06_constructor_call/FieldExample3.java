package ex07_06_constructor_call;

import java.util.Scanner;

public class FieldExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력해주세요 >");
		
		Circle i = new Circle(sc.nextDouble());
		
		sc.close();
		printradius_area(i);
	}//main()
	
	public static void printradius_area(Circle i) {
		double area = i.getArea();
		System.out.println("원의 반지름 : "+i.radius);
		System.out.println("원의 넓이 : "+area);
	}
}
