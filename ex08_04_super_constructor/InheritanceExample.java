package ex08_04_super_constructor;

public class InheritanceExample {
	public static void main (String args[]) {
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333","ȫ�浿",100,20000);
	
		try{
			int amount = obj.withdraw(500);
			System.out.println("����� : "+amount);
			System.out.println("�ܾ� : "+obj.balance);
			System.out.println("���̳ʽ�, �ѵ� : "+obj.creditLine);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
