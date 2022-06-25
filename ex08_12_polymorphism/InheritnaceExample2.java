package ex08_12_polymorphism;

public class InheritnaceExample2 {
	public static void main (String args[]) {
		Account obj1 =new Account("111-22-33333","ÀÓ²©Á¤",10000);
		
		CheckingAccount obj2 = new CheckingAccount ("444-555-666666",
				"È«±æµ¿",20000,"5555-6666-7777-8888");
		
		CreditLineAccount obj3 = new CreditLineAccount(
				"777-88-999999999","±è¼±´Þ",3000,2000000);
		
		BonusPointAccount obj4 = new BonusPointAccount(
				"000-00-000000","±è¹Ì¿ª",0,0);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}

	private static void printAccountInfo(Account obj1) {
		System.out.println("°èÁÂ¹øÈ£ : "+obj1.accountNo);
		System.out.println("¿¹±ÝÁÖ ÀÌ¸§ : "+obj1.ownerName);
		System.out.println("ÀÜ¾× : "+obj1.balance);
		System.out.println();
	}
}
