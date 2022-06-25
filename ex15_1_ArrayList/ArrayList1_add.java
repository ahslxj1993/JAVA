package ex15_1_ArrayList;
/*
 * List �������̽� - Array List(��ӹ޴� Ŭ����)
 * 
 * 1. ������ ���ڷ����� Data�� ��� �����Ҽ� �ֽ��ϴ�
 * 	ex) int, double, char, boolean, String
 * 2. �Է��� ������� ��µ˴ϴ�
 * 3. �ߺ��� Data�� �����Ҽ� �ս��ϴ�
 * 4. ������ ���屸���� �̿��Ҽ� �ֽ��ϴ� (add(), remove())
 * */
import java.util.ArrayList;

public class ArrayList1_add {
	public static void main(String [] args) {
		//��ĳ����(������� �޼ҵ常 ��밡���մϴ�)
		//List list = new ArrayList();
		ArrayList list = new ArrayList();
		
		list.add("�ϳ�");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
		
		System.out.println(list);
		System.out.println(list.toString());
		
		//size() : �������� ���� ���ϴ� �޼ҵ�
		System.out.println("�������� ���� = "+list.size());
		
		//get(index) : �ش� �ε����� ������ �������� �޼ҵ�
		//get(3) : 0���� ����, index =3 �� ������ ����ض�
		System.out.println("list.get(3) ="+list.get(3));
	}
}
