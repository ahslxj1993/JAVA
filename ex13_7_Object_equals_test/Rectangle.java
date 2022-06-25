package ex13_7_Object_equals_test;

public class Rectangle {
	int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "가로는 "+width+", 세로는 "+height;
	}
	
	public boolean equals(Object obj) {
		if ( obj !=null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return this.width == r.width &&
					this.height == r.height; 
		}
		else
			return false;
	}
}
