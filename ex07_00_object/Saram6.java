package ex07_00_object;

class Saram6 {
	//�ʵ�(�������)
	String name;
	double w;
	double ki;
	int age;
	
	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram6 (String name , double w , double ki , int age){
		/*
		 * this ��?
		 * �ڹٴ� ��ü�� �����Ҽ��ֵ��� this Ű���带 �����մϴ�.
		 * ���������� �ν��Ͻ� �ڽ��� �ּҰ� ����Ǿ� �ֽ��ϴ�.
		 * �����ڿ� ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� �����մϴ�.
		 */
		
		this.name=name;
		this.w=w;
		this.ki=ki;
		this.age=age;
	}
	Saram6 (String name2, double w2){
		this.name = name2;
		w= w2;
	}
	Saram6 (double w, String name){
		this.name = name;
		this.w= w;
	}
	
	
	//�޼���
	public void eat() {
		System.out.println(this.name +"��(��) ���� �Դ´�.");
	}
	
	public void walk() {
		System.out.println(this.name +"��(��) �ȱ��� �����Դ�"+w+"�Դϴ�.");
	}
	
	public void sesu() {
		System.out.println(this.name +"��(��) �����Ѵ�.");
	}
}
