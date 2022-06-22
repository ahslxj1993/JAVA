package ex10_01_package;
private class Account { //only public, abstract & final are permitted
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
	
	int withdraw(int amount ) throws Exception { //����
		if (balance < amount)
			throw new Exception("�ܾ׺���");
		balance -= amount;
		return amount;
	}
}
