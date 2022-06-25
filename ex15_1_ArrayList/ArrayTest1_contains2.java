package ex15_1_ArrayList;
/*
 * ArrayList�� �ִ� ������ �˻��ϴ� ��
 * -indexOf(data) : ���ڿ� ���� ���� ���� ù��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * -lastIndexOf(data): ���ڿ� ���� ���� ���������� ������� �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * - ���ڿ� ���� ���� ������ -1�� ����
 * */


import java.util.ArrayList;

public class ArrayTest1_contains2 {
	public static void main (String args[]) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("��");
		list2.add("��");
		list2.add("����");
		list2.add("�ܿ�");

		//list2���� list1�� ����Ǵ� ��ҵ��� ã�Ƽ� ����
		for (int i=0; i<list2.size();i++) {
			//������ ��ü(list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
			if(list1.contains(list2.get(i)))
				list2.remove(i--);
				//list2.remove(i);
				//i--;
		}
		
		/*�ڿ������� ã��
		for (int i=list2.size()-1; i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		*/
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
