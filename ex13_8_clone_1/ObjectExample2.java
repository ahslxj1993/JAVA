package ex13_8_clone_1;

public class ObjectExample2 {
	public static void main (String [] args) {
		//��ü ����
		Rectangle obj1 = new Rectangle(10,20);
		//clone �޼���� ��ü�� ����
		Rectangle obj2 = (Rectangle) obj1.clone();
		
		//���� ��ü�� ��ü ��ü�� ���� ���
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.height = 100; obj1.width = 200;
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
