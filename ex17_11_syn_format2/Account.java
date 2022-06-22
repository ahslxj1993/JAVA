//공유영역 클래스
package ex17_11_syn_format2;

public class Account {
	private String accountNo; //계좌번호
	private String ownername; //예금주이름
	private int balance; //잔액
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo; //계좌번호
		this.ownername = ownerName; //예금주
		this.balance = balance; //잔액
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
	
	void deposit(int amount) { //입금
		balance+= amount;
	}
	
	int withdraw(int amount) { //출금
		if (balance<amount)
			return 0;
		balance-=amount;
		return amount;
		
	}

}
