package ex10_09.gemetry.common;

public class Polygon {
	public int x[];
	protected int y [];//�������� y ��ǥ
	protected Polygon(int size) { //������
		x= new int [size];
		y= new int[size]; 
	}
	//�������� ��ǥ�� �����Ѵ�
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}
