package ex08_01_inheritance;

public class CheckingAccount extends Account {
	String cardNo;

	
	CheckingAccount(){
	}
	/*
	 * 메서드 이름 pay
	 * 매개변수 - 카드번호(String cardNo), 인출액(int amount)
	 * 반환형 - int
	 * 반환되는 값 - 부모 클래스의 인출메서드 호출
	 * 
	 * balance 필드와 withdraw() 메서드는 Account클래스로부터 상속받아 사용
	 * 이클래스안에 선언되어 있는것 처럼 사용하고있음
	 */
	
	//직불카드 사용액을 지불한다에 해당하는 메소드
	int pay (String cardNo, int amount) throws Exception{
		if (!cardNo.equals(this.cardNo) || (balance<amount))
				throw new Exception("지불이 불가능합니다");
		return withdraw(amount);
	}
	
}
