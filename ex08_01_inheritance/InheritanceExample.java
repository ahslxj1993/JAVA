package ex08_01_inheritance;

public class InheritanceExample {
	public static void main(String [] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.accountNO = "111-22-333333333";
		obj.ownerName = "È«±æµ¿";
		obj.cardNo = "5555-6666-7777-8888";
		obj.deposit(10);
		
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("ÁöºÒ¾× : "+paidAmount);
			System.out.println("ÀÜ¾× : "+obj.balance);
		}	catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
