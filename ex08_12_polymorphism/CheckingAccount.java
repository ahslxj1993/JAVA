package ex08_12_polymorphism;

class CheckingAccount extends Account {
	String cardNo;

	//�ڹ� �����Ϸ��� ������ �� ���� Ŭ������ ������ ù��° ��ɹ���
	//���� Ŭ������ ������ ȣ�⹮�� �ƴϸ�
	//�ڵ����� ����Ŭ������ no-arg constructor ȣ�⹮�� �߱��մϴ�
	//������ ����Ŭ�������� no-arg constructor�� ��� ������ ���� �߻�
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo,ownerName,balance);
		this.cardNo = cardNo; // Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}

	// ����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�");
		return withdraw(amount);
	}

}
