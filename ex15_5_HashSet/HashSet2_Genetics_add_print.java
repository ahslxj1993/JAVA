package ex15_5_HashSet;
/*
 * Set �������̽�
 * -HashSet (��ӹ޴� Ŭ����) : ���������� HashMap�� �̿��ؼ� �����������
 * 	HashSet�̶� �̸��� �ؽ��� �̿��ؼ� �����߱� ������ �ٿ��� ���Դϴ�.
 * -TreeSet�� ���� �˻�Ʈ�� (binary search tree)��� �ڷᱸ���� ���·�
 * 	�����͸� �����ϴ� �÷��� Ŭ�����Դϴ�. ������ �˴ϴ�.
 * 1. �������� �ڷ��� (�⺻�ڷ����� ������ ���)�� Data�� ��� �����Ҽ��ֽ��ϴ�.
 * 	ex) int, double, char, boolean, String etc
 * 2. �������� ��,��µ˴ϴ�.
 * 3. �ߺ��� �����͸� �������� ���մϴ�
 *		��) �ζǹ�ȣ 6���� �ߺ������ʰ��ϴ� ���α׸��� �̿�
 * */

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2_Genetics_add_print {
	public static void main (String [] args) {
		//HashSet ��ü ����
		HashSet<String> set = new HashSet<String>();
		
		//����������
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		
		System.out.println("����� �������� �� = "+set.size());
		
		//set ��ü�� �����ϰ� �ִ� �����Ͱ�ü ���
		System.out.println(set);
		
		//iterator() : set�� �ִ� �����͸� ��� �����ɴϴ�.
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
