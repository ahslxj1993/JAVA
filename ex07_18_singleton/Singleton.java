package ex07_18_singleton;
//�̱���
public class Singleton {
	//�ʵ� s �� �ܺο��� �����մϴ�
	//�� ������ ó�� �̱��� Ŭ������ JVM�� �ε��ɶ� �ѹ��� ����˴ϴ�
	private static Singleton s = new Singleton();
	
	//private : �ܺο��� �����ڸ� ȸ���Ҽ� ������ �����ϴ�.
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("����� �̱����Դϴ�.");
		return s;
	}
}