package ex08_04_super_method;

public class InheritanceExample {
	public static void main (String [] args) {
		BonusPointAccount obj = new BonusPointAccount("33-33-33333","��̿�",0,0);
		
		obj.deposit(1000);
		System.out.println("�ܾ� : "+obj.balance);
		System.out.println("���� ����Ʈ : "+obj.bonusPoint);
	}
}
