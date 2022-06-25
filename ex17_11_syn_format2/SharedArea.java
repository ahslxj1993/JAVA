package ex17_11_syn_format2;

public class SharedArea {
	private Account account1; // 이몽룡의 계좌
	private Account account2; // 성춘향의 계좌
	
	SharedArea(Account account1, Account account2){
		this.account1 = account1;
		this.account2 = account2;
	}
	//*동기화방법
	synchronized void transfer() {//계좌이체를 한다
			account1.withdraw(1000000);
			account2.deposit(1000000);;
	}//transfer() end

	
	int getTotal() { //잔액 합계를 구한다
		synchronized (this) {
			return account1.getBalance() + account2.getBalance();
		}//동기화 끝
	}//getTotal () end
	
	
	public Account getAccount1() {
		return account1;
	}

	public void setAccount1(Account account1) {
		this.account1 = account1;
	}

	public Account getAccount2() {
		return account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	
}
