package ex08_12_polymorphism;

class CheckingAccount extends Account {
	String cardNo;

	//자바 컴파일러가 컴파일 시 서브 클래스의 생성자 첫번째 명령문이
	//슈퍼 클래스의 생성자 호출문이 아니면
	//자동으로 슈퍼클래스의 no-arg constructor 호출문을 추기합니다
	//하지만 슈퍼클래스에는 no-arg constructor가 없어서 컴파일 에러 발생
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo,ownerName,balance);
		this.cardNo = cardNo; // 클래스 안에 선언된 필드 초기화
	}

	// 직불카드 사용액을 지불한다에 해당하는 메소드
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다");
		return withdraw(amount);
	}

}
