package ex09_03_upcasting;

class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {

		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo; 
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다");
		return withdraw(amount);
	}

}
