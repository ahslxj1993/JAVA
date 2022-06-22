package ex08_04_final_class;
//-상속받은 withdraw 메소드를 다시 구현(메소드 오버라이딩)하는 클래스
/*메소드 오버라이딩(슈퍼 클래스에 정의된 메소드를 서브 클래스에서 재정의하는것)의 조건
 * 1. 상속관계
 * 2. 부모 클래스의 선언부와 일치(리턴값타입, 메서드이름, 매개변수 목록)
 * 3. 접근 제어자의 범위는 같거나 넓어야 한다
 */

public class CreditLineAccount extends Account{
	int creditLine;//마이너스 한도 필드
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	//메소드 오버라이딩 - 인출한다 기능 다시 구현
	//(잔액+마이너스한도)< 인출액 경우 "인출이 불가능합니다" 예외 생성
	int withdraw(int amount) throws Exception{
		if ((balance+creditLine)<amount)
			throw new Exception("인출이 불가능 합니다");
		balance -= amount;
		return amount;
	} 

}
