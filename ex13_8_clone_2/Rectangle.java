package ex13_8_clone_2;
/*
 * ���� ������ Ŭ���� �����
 * 1�ܰ� Cloneable �������̽� ����
 * 2�ܰ� clone() �޼ҵ� �������̵� �ϱ�
 * */

//Cloneable �������̽��� �����Ǿ� �ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ��Դϴ�.
public class Rectangle implements Cloneable {
	int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Object Ŭ������ ���ǵ� clone()
	 * protected Object clone() throws CloneNotSupportedException;
	 * ==> �������̵��� ���� ������ ����
	 * (protected => public : ��Ӱ��� ���� �ٸ� Ŭ�������� ȣ�� �� �� �־��ϴ�.)
	 */
	
	/*
	 * ���� ��ȯ Ÿ��(covariant return type) - JDK1.5 ���� ����
	 * �������̵� �Ҷ� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ 
	 * ����ϴ� ���Դϴ�
	 * 
	 * ��, ��ȯ���� Object ���� �ڼ� Ŭ���� Ÿ������ ������ ����մϴ�.
	 * 
	 * ������: clone()ȣ�� �� �� ��ȯ�� �ʿ�����ϴ�(���� �޼���)
	 * Rectangle obj2 = (Rectangle) obj1. clone();
	 * ==> Rectangle obj2 = obj1.clone();
	 * */
	
	public Rectangle clone() {//����� �� : Object�� -> Rectangle ������ ����
		try {
			//���� Ŭ������ clone�޼��带 ȣ���ؼ� �� ����� ����
			return (Rectangle) super.clone(); // ����Ȱ� : Rectangle ������ ��ȯ�մϴ�.
		}
		//���� Ŭ������ clone�޼��尡 �߻��ϴ� �ͼ����� ó��
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	/*
	public Object clone() {//��ȯ���� Object ���Դϴ�.
		try {
			//���� Ŭ������ clone�޼��带 ȣ���ؼ� �� ����� ����
			return super.clone();
		}
		//���� Ŭ������ clone�޼��尡 �߻��ϴ� �ͼ����� ó��
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	*/
	
	public String toString() {
		return "���δ� "+width+", ���δ� "+height;
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
