package ex17_01_Thread_sleep;
/*�̱۾����庸�� ��Ƽ�����带 ����ϸ� �� ȿ������ ���
 * 1.�����͸� �Է¹޴� �۾�
 * 2.��Ʈ��ũ�� ������ �ְ�޴� �۾�
 * 3. �����ͷ� ������ ����ϴ� �۾��� �ܺα����� ������� �ʿ�� �ϴ� ����Դϴ�,..
 * 
 * ThreadExample1.java�� 
 * �ϳ��� ������� ������� �Է��� �޴� �۾��� ȭ�鿡 ���ڸ� ����ϴ�
 * �۾��� ó���ϱ� ������ ����ڰ� �Է��� ��ġ�� ��������
 * ȭ�鿡 ���ڰ� ��µ��� �ʴٰ� ����ڰ�
 * �Է��� ��ġ�� ������ ȭ�鿡 ���ڰ� ��µ˴ϴ�.
 */


public class TreadExample2 {
	public static void main(String [] args) {
		Thread DigitThread = new DigitThread();
		DigitThread.start();
		
		for(char ch = 'A'; ch <='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
				//sleep �޼ҵ� : �����ð��� �汫�Ǳ⸦ ��ٸ��� �޼ҵ�
				//public static void sleep(long Millis) throws Interrupted
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
