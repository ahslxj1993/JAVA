package ex07_00_object;

class Saram4 {
	//�ʵ�(�������)
	String name;
	double w;
	double ki;
	int age;
	
	//������
	Saram4 (String any , double w2){
		name=any;
		w=w2;
	}
	
	//�޼���
	public void eat() {
		System.out.println(name +"��(��) ���� �Դ´�.");
	}
	
	public void walk() {
		System.out.println(name +"��(��) �ȱ��� �����Դ� "+w+"�Դϴ�.");
	}
	
	public void sesu() {
		System.out.println(name +"��(��) �����Ѵ�.");
	}
}
