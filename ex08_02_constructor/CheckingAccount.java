package ex08_02_constructor;

class CheckingAccount extends Account {
	String cardNo;

	// �������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴµ� �ڼ� Ŭ������ �����
	// �θ� Ŭ������ ����� ����Ҽ� �����Ƿ� �θ��� ������� ���� �ʱ�ȭ �Ǿ� �־���Ѵ�,
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {

		// ������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ�
		// ȣ���ϴ� ������ super();�� ���⿡ �����մϴ�,

		super();
		this.accountNo = accountNo;// ��ӹ��� �ʵ� �ʱ�ȭ
		this.ownerName = ownerName;// ��ӹ��� �ʵ� �ʱ�ȭ
		this.balance = balance;// ��ӹ��� �ʵ� �ʱ�ȭ
		this.cardNo = cardNo; // Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
	}

	// ����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�");
		return withdraw(amount);
	}

}
