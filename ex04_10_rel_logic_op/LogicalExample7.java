package ex04_10_rel_logic_op;

public class LogicalExample7 {
	public static void main(String args[]) {
		int a=20, b=20;
		
		if (a>=20 || ++b>=20) {//a>=20 �� ���̹Ƿ� �ι�° �ǿ����ڴ� ������ �ʴ´�.
			System.out.println("�� : "+b);
			} else {
				System.out.println("���� : "+b);
			}
		System.out.println(b);
		System.out.println("=========================");
		
		a=10;  b=20;
		if (a>=20 || ++b>=20) {// a>=20 �� �����̹Ƿ� �ι�° �ǿ����ڴ� ���Ѵ�.
			System.out.println("�� : "+b);
			} else {
				System.out.println("���� : "+b);
			}
		System.out.println(b);
	}
}
