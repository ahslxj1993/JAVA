package ex05_IfExample_1;

public class Ifexample {
	public static void main(String args[]) {
		int num1=52;
		int num2=24;
		int num3=32;
		
		if (num1>num2) {
			if (num1>num3)
				System.out.println("num1 �� ���� Ů�ϴ�.");
		}
		//�� ������ �Ѱ��� if ���� &&�����ڷ� �ٲٸ�?
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 �� ���� Ů�ϴ�");
		}
			
		System.out.println("��");
		
	}
}