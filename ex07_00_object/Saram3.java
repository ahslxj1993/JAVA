package ex07_00_object;

class Saram3 {
	//�ʵ�(�������)
	String name;
	double w;
	double ki;
	int age;
	
	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram3(String any){
		name = any;
	}
	
	//�޼���
	public void eat() {
		System.out.println(name +"��(��) ���� �Դ´�.");
	}
	
	public void walk() {
		System.out.println(name +"��(��) �ȴ´�.");
	}
	
	public void sesu() {
		System.out.println(name +"��(��) �����Ѵ�.");
	}
}
