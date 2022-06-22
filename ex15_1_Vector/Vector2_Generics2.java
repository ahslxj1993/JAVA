package ex15_1_Vector;
/*
 * Vector Ŭ���� - ArrayList�� ������
 * 				 ArrayList�� ���� ���, ���߿��� ArrayList�� �� ���� ���
 * 1.�������� �ڷ����� DATA�� ��� �����Ҽ� �ֽ��ϴ�
 * 2. �����ִ� ��.��� ó��(index��ȣ ������ �����)
 * 3.�ߺ��� �����͸� �����Ҽ� �ֽ��ϴ�.,
 * 4.����� ����� �پ��մϴ�(���������� ��°���)
 * 5. ������ ����ȭ�� �ϱ� �빮�� ���� ������ ó��������
 * ArrayList �� LinkedList���� ������ �������ϴ�.
 * 
 *  ����) ����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� ��������
 *  	 �ٸ� �����忡�� �����ڿ��� �������� ���ϰ� ����ϴ°�
 * */
import java.util.Vector;

public class Vector2_Generics2 {
	public static void main (String [] args) {
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		print(vec);
		
		vec.add(2,"kiwi");
		print(vec);
		
		vec.set(0, "orange");
		print(vec);
		
		vec.remove("kiwi");
		print(vec);
	}
	
	private static void print(Vector vec) {
		for (int i =0; i<vec.size();i++) {
			String str = (String) vec.get(i);
			System.out.println(str);
		}
		System.out.println("====================================");
	}
}
