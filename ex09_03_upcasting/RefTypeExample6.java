package ex09_03_upcasting;
//obj������ Ÿ���� Account �̱� ������
//Account �� ���� pay �޼ҵ峪 cardNo �ʵ�� ������ ���� �߻�
public class RefTypeExample6 {
	public static void main(String [] args) {
		Account obj = new CheckingAccount("111-22-333333333","ȫ�浿",10,"4444-5555-6666-7777");
		
		try {
			int amount= obj.pay("4444-5555-6666-7777",470000);
			System.out.println("����� : "+amount);
			System.out.println("ī���ȣ : "+obj.cardNo);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		};
	}
}