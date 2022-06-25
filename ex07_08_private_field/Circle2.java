//private �ʵ带 ���� Ŭ������ ��
/*
 * ��ü ���� ���α׷����� �ֿ� Ư¡�� �ϳ��� ĸ��ȭ�� Ŭ���� ����� Ŭ���� ���ο� ���ߴ� ���Դϴ�
 * Ŭ���� ����� �ܺο��� ������ �� ������ �����ϱ����� private�� ����մϴ�.
 * ������ �Ϻ� ����� �ܺ� Ŭ������ ����Ҽ��ֵ��� �����ؾ� �մϴ�.
 * 
 * ���� �������� ������ ���� ȸ�θ� ĸ��ȭ�ؼ� ���������� ������ư,
 * ���� ���� ��ư ���� �ܺο� �����ؼ� ����� �� �ְ� �մϴ�.
 * ��ó�� Ŭ���� ���ο� ������ �ʵ带 �ܺο��� ��� �� �� �ֵ���
 * getter�� setter �� ���� �մϴ�
 * 
 * �Ϲ������� getter �� get, setter �� set���� �����ϴ� �̸��� ����մϴ�.
 * radius �ʵ忡 �����ϱ� ���ؼ� getRadius(), setRadius() �޼��带 ����غ��ô�.
 */


package ex07_08_private_field;

class Circle2 {
	//���������� private -> ������ ����
	private double radius;
	
	final double PI = 3.14;
	
	
	Circle2 (double radius){
		this.radius=radius;
	}
	
	double getArea() {
		double area=radius*radius*PI;
		return area;
	}
	//getter �޼���
	public double getRadius() {
		return radius;
	}
	//setter �޼���
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
