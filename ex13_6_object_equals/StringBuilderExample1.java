package ex13_6_object_equals;

public class StringBuilderExample1 {
	public static void main (String [] args) {
		StringBuffer sb = new StringBuffer("���ع��� ��λ��� ������ ");
		StringBuffer sb2 = new StringBuffer("���ع��� ��λ��� ������ ");
		
		if (sb == sb2) {
			System.out.println("sb==sb2 ����");
		}
		else
			System.out.println("sb==sb2 �ٸ�");
		
		//StringBuffer Ŭ������ equals() �޼��带 �������̵� ���� �ʾ���
		if (sb.equals(sb2))
			System.out.println("sb.equals(sb2)  ����");
		else
			System.out.println("sb.equals(sb2) �ٸ�");
		
		
		
		if (sb.toString().equals(sb2.toString()))
			System.out.println("sb.toString().equals(sb2.toString()) ����");
		else
			System.out.println("sb.toString().equals(sb2.toString()) �ٸ�");
	}
}
