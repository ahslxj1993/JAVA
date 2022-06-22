package ex09_07_instanceof;

public class RefTypeExample11 {
	public static void main(String args[]) {
		Account obj = new CheckingAccount("111-22-333333333", "ȫ�浿", 100000, "5555-6666-7777-8888");

		if (obj instanceof CheckingAccount) {
			pay((CheckingAccount) obj);
		} else {
			System.out.println("ĳ��Ʈ�Ҽ� ���� Ÿ���Դϴ�.");
		}
	}

	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("����� : " + amount);
			System.out.println("ī���ȣ : " + obj.cardNo);
			System.out.println("���� �ܾ� : "+obj.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
