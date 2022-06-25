package ex08_03_super_constructor;

public class InheritanceExample {
	public static void main (String args[]) {
		CheckingAccount2 obj = new CheckingAccount2("111-22-33333333","È«±æµ¿",0,"555-666-777-8888");
		
		obj.deposit(1000000);
		
		try{
			int paidAmount = obj.pay("555-666-777-8888", 47000);
			System.out.println("ÁöºÒ¾× : "+paidAmount);
			System.out.println("ÀÜ¾× : "+obj.balance);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
