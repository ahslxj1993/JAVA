package ex09_03_upcasting;
//obj������ Ÿ���� Account �̱� ������
//Account �� ���� pay �޼ҵ峪 cardNo �ʵ�� ������ ���� �߻�
public class RefTypeExample7 {
	public static void main(String [] args) {
		Account obj = 
				(Account)new CheckingAccount("111-22-333333333","ȫ�浿",10000,
						"4444-5555-6666-7777");
		
		try {
			obj.withdraw(1000);
			System.out.println("���¹�ȣ : "+obj.accountNo);
			System.out.println("������ �̸� : "+obj.ownerName);
			System.out.println("�ܾ� : "+obj.balance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		};
	}
}
