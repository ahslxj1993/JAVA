package ex08_03_super_constructor;
//��� Ŭ������ ������ Object Ŭ���� �Դϴ�
//�ٸ� Ŭ�����κ��� ��� �������� ��� Ŭ�������� �ڵ������� Object Ŭ������ ���� ��� �޽��ϴ�..
public class Account { //�����Ϸ��� extends Object�� �ڵ������� �߰��մϴ�
	String accountNo;//���¹�ȣ
	String ownerName;//�������̸�
	int balance;	//�ܾ�
	
	Account (String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit (int amount) { //����
		balance += amount;
	}
	
	int withdraw(int amount ) throws Exception{ //����
		if (balance < amount)
			throw new Exception ("�ܾ׺���");
		balance -= amount;
		return amount;
	}
}
