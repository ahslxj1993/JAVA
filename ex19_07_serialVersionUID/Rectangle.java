/*���� �簢�� Ŭ������ �޼ҵ带 �߰��� ���
 * �����߻� : ����ȭ �Ҷ� ����� Ŭ������
 * ������ȭ �Ҷ� ����� Ŭ������ ������ �ٸ��� ����
 * */

package ex19_07_serialVersionUID;

public class Rectangle implements java.io.Serializable{

	private static final long serialVersionUID = -8293824171898762620L;
	private int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "���� : "+width+
				"\n���� : "+height;
	}
	
	/*������
	 * 
	 * 1.�Ʒ� getArea �޼ҵ��� �ּ��� �ް� ������ ��쿡�� ���� ����
	 * ObjectOutputExample.java�� ����
	 * ObjectInputExample.java ����
	 * 
	 * 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ�� - �����߻�
	 * ObjectInputExample.java ����
	 * 
	 * serialVersionUID�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	 * Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	 * serialVersionUID ���� �ʵ尡 �߰��˴ϴ�.
	 * 
	 * serialVersionUID�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����� ��
	 * �ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	 * Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� serialVersionUID�� �ο��˴ϴ�.
	 * 
	 * ������ ��������� Ŭ������ serialVersionUID�� ����Ǿ� ������
	 * �����Ͻ� �߰����� �ʱ� ������ ������ ���� �����Ҽ� �ֽ��ϴ�.
	 * */
	
	
	/*
	int getArea() {
		return width * height;
	}
	*/
	
	
}
