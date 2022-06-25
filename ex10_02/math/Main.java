package ex10_02.math;

import ex10_02.geometry.polygon.Rectangle;
public class Main {
	public static void main(String [] args) {
		Rectangle obj = new Rectangle(2,3);
		
		
		System.out.println("가로 : "+obj.getWidth());
		System.out.println("높이 : "+obj.getHeight());
		System.out.println("면적 : "+obj.getArea());
	}
}
