package ex03_4_casting;

public class Casting1_int_float {
	public static void main(String[] args) {
		
		int i1 = 10;
		
		//1.�ڵ� ����ȯ, ������ ����ȯ, �Ͻ��� ����ȯ
		//�ڵ� ����ȯ�� ������ ���� �����ϰų� �޼����� ���ڰ��� �Ű������� ���ɵɶ�
		//��ġ���� ���� �ڷ����� ��� �����Ϸ��� �ڵ����� ����ȯ�� ���ִ� ���Դϴ�.
		//double d1 = (double)i1;
		
		double d1=i1;//�Ǽ��� ������ ������ ���� �����Ҽ� �ֽ��ϴ�.
		System.out.println("d1 �����ʹ� "+d1+"�Դϴ�.");
	}
}
