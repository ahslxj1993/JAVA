package ex08_04_final_class;
//-��ӹ��� withdraw �޼ҵ带 �ٽ� ����(�޼ҵ� �������̵�)�ϴ� Ŭ����
/*�޼ҵ� �������̵�(���� Ŭ������ ���ǵ� �޼ҵ带 ���� Ŭ�������� �������ϴ°�)�� ����
 * 1. ��Ӱ���
 * 2. �θ� Ŭ������ ����ο� ��ġ(���ϰ�Ÿ��, �޼����̸�, �Ű����� ���)
 * 3. ���� �������� ������ ���ų� �о�� �Ѵ�
 */

public class CreditLineAccount extends Account{
	int creditLine;//���̳ʽ� �ѵ� �ʵ�
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	//�޼ҵ� �������̵� - �����Ѵ� ��� �ٽ� ����
	//(�ܾ�+���̳ʽ��ѵ�)< ����� ��� "������ �Ұ����մϴ�" ���� ����
	int withdraw(int amount) throws Exception{
		if ((balance+creditLine)<amount)
			throw new Exception("������ �Ұ��� �մϴ�");
		balance -= amount;
		return amount;
	} 

}
