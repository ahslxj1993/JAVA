package ex06_02_method;

/*
 * 1. �޼��� �̸� : add
 *  �Ű����� : ������ 2��
 *  ��� : �Ű������� ���� ���Ѵ�
 *  ��ȯ��: �Ű������� ���� ���Ѵ�
 *  ��ȯ��: int
 *  
 *  2. 1������ ������ add �޼��带 ȣ���մϴ�
 *  ���ڰ����� 3�� 4�� ����մϴ�
 *
 */

public class MethodQuestion {
	public static int add(int i, int j) {
		int sum;
		sum = i + j;
		return sum;
		// ���� ������ 
		//return i+j; �� �ϸ� �� �����ϴ�.
	}

	public static void main(String args[]) {
		System.out.println(add(3, 4));
	}

}
