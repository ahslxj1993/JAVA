package ex08_04_final_class;

class Account { //컴파일러가 extends Object를 자동적으로 추가합니다
	String accountNo;//계좌번호
	String ownerName;//예금주이름
	int balance;	//잔액
	
	Account (String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit (int amount) { //예금
		balance += amount;
	}
	
	int withdraw(int amount ) throws Exception{ //인출
		if (balance < amount)
			throw new Exception ("잔액부족");
		balance -= amount;
		return amount;
	}
}
