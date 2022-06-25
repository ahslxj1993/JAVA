package ex08_03_super_constructor;

class CheckingAccount2 extends Account {
	String cardNo;

	//�ڹ� �����Ϸ��� ������ �� ���� Ŭ������ ������ ù��° ��ɹ���
	//���� Ŭ������ ������ ȣ�⹮�� �ƴϸ�
	//�ڵ����� ����Ŭ������ no-arg constructor ȣ�⹮�� �߱��մϴ�
	//������ ����Ŭ�������� no-arg constructor�� ��� ������ ���� �߻�
	CheckingAccount2(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo,ownerName,balance);
		this.cardNo = cardNo; // Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}

	// ����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�");
		return super.withdraw(amount);
	}

}
