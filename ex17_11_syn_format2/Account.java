//�������� Ŭ����
package ex17_11_syn_format2;

public class Account {
	private String accountNo; //���¹�ȣ
	private String ownername; //�������̸�
	private int balance; //�ܾ�
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo; //���¹�ȣ
		this.ownername = ownerName; //������
		this.balance = balance; //�ܾ�
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) { //�Ա�
		balance+= amount;
	}
	
	int withdraw(int amount) { //���
		if (balance<amount)
			return 0;
		balance-=amount;
		return amount;
		
	}

}
