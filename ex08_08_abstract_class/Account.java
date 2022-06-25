package ex08_08_abstract_class;
//�ν��Ͻ�ȭ�� �����ϴ� abstract Ű����
//abstract Ű���尡 ���� Ŭ������ �߻� Ŭ���� ��� �Ѵ�
abstract class Account { //�����Ϸ��� extends Object�� �ڵ������� �߰��մϴ�
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
