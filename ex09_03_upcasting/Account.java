package ex09_03_upcasting;
//모든 클래스의 조상은 Object 클래스 입니다
//다른 클래스로부터 상속 받지않은 모든 클래스들은 자동적으로 Object 클래스로 부터 상속 받습니다..
public class Account { //컴파일러가 extends Object를 자동적으로 추가합니다
	String accountNo;//계좌번호
	String ownerName;//예금주이름
	int balance;	//잔액
	
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
