package ex03_4_casting;

public class Casting1_int_float2 {
	public static void main(String[] args) {
		
		double d2=10.12345;
		
		//2. ����� ����ȯ
		// �����߻� - Type mismatch: cannot convert form double to int
		//int i2 = d2;//������ ����(4byte)�� �Ǽ��� ��(8byte)�� �����Ҽ� �����ϴ�. 
		
		int i2= (int) d2;
		
		System.out.println("i2�� ����"+i2+"�Դϴ�.");
	}
}