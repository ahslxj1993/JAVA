package ex08_01_inheritance;

public class CheckingAccount extends Account {
	String cardNo;

	
	CheckingAccount(){
	}
	/*
	 * �޼��� �̸� pay
	 * �Ű����� - ī���ȣ(String cardNo), �����(int amount)
	 * ��ȯ�� - int
	 * ��ȯ�Ǵ� �� - �θ� Ŭ������ ����޼��� ȣ��
	 * 
	 * balance �ʵ�� withdraw() �޼���� AccountŬ�����κ��� ��ӹ޾� ���
	 * ��Ŭ�����ȿ� ����Ǿ� �ִ°� ó�� ����ϰ�����
	 */
	
	//����ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	int pay (String cardNo, int amount) throws Exception{
		if (!cardNo.equals(this.cardNo) || (balance<amount))
				throw new Exception("������ �Ұ����մϴ�");
		return withdraw(amount);
	}
	
}
