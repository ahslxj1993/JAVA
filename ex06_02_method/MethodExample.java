package ex06_02_method;

public class MethodExample {

	// ���������� 		��ü���� ���� ���ٰ���	��ȯ�Ǵ°��� �ڷ���			�޼����̸�(�Ű����� ���)
	public 			static 				void 					main(String args[]) {
		int num = 50;
		char data = '*';
		// num ������ ������ �ִ� ���� print() �޼��� �ȿ��� ����Ϸ��� ��� �ؾ� �ұ��?
		print(data, num); // �޼����� ��ȣ�ȿ� ���� �־��ָ� �˴ϴ�.
		// �޼��带 ������ ������ num ���� �����ϱ� ���� ������ ������ �־�� �մϴ�,
		// ȣ���ϴ� �޼��忡�� ����� num�� ���� ���ڶ�� �ϸ�
		// �޼��� ���ǿ� ���� parameter�� �Ű����� ��� �մϴ�.
		stars(num, data);
		return; // ���⼭ main() �޼��带 �����մϴ�.
	}

	// �޼��� ���� //parameter�� �Ű�����(�̸��� �ٲ� �������)
	public static void print(char parameter, int parameter2) {
		System.out.println("print() �޼��� �Դϴ�.");
		System.out.println("main() �޼��忡�� ���޹��� �������� ���� " + parameter + "," + parameter2 + " �Դϴ�.");
	}

	public static void stars(int par_num, char parameter) {
		for (int i = 0; i < 51; i++) {
			System.out.print(parameter);
		}
		return; // ��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� �����մϴ�.
	}

}
