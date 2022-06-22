package ex10_09.gemetry.common;

public class Polygon {
	public int x[];
	protected int y [];//꼭지점의 y 좌표
	protected Polygon(int size) { //생성자
		x= new int [size];
		y= new int[size]; 
	}
	//꼭지점의 좌표를 설정한다
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}
