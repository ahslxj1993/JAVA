package ex08_01_inheritance;
//��� Ŭ������ ������ Object Ŭ���� �Դϴ�
//�ٸ� Ŭ�����κ��� ��� �������� ��� Ŭ�������� �ڵ������� Object Ŭ������ ���� ��� �޽��ϴ�..
public class Account { //�����Ϸ��� extends Object�� �ڵ������� �߰��մϴ�
	String accountNO;//���¹�ȣ
	String ownerName;//�������̸�
	int balance;	//�ܾ�
	
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
