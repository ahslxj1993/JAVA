package ex10_02.math;

import ex10_02.geometry.polygon.Rectangle;
public class Main {
	public static void main(String [] args) {
		Rectangle obj = new Rectangle(2,3);
		
		
		System.out.println("���� : "+obj.getWidth());
		System.out.println("���� : "+obj.getHeight());
		System.out.println("���� : "+obj.getArea());
	}
}
