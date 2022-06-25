package ex07_2_Exception;

public class ExceptionExample3_1 {
	public static void main (String [] args) {
		int result;
		try {
			result = add(1,-2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//throws Exception : throw�� ���� �߻��� ������ ȣ���� �޼���� �ѱ�ϴ�.
	static int add (int a, int b) throws Exception {
		int result = a+b;
		if (result <0)
			throw new Exception("0���� �۾Ƽ� ������ �߻��մϴ�");
		System.out.println("�� �κ��� ����� �ɱ�?");
		return result;
	}
}
