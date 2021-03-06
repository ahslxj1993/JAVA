package ex09_07_instanceof;

public class RefTypeExample11 {
	public static void main(String args[]) {
		Account obj = new CheckingAccount("111-22-333333333", "홍길동", 100000, "5555-6666-7777-8888");

		if (obj instanceof CheckingAccount) {
			pay((CheckingAccount) obj);
		} else {
			System.out.println("캐스트할수 없는 타입입니다.");
		}
	}

	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액 : " + amount);
			System.out.println("카드번호 : " + obj.cardNo);
			System.out.println("통장 잔액 : "+obj.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
