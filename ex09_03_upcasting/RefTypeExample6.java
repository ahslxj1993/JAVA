package ex09_03_upcasting;
//obj변수의 타입이 Account 이기 때문에
//Account 에 없는 pay 메소드나 cardNo 필드는 컴파일 에러 발생
public class RefTypeExample6 {
	public static void main(String [] args) {
		Account obj = new CheckingAccount("111-22-333333333","홍길동",10,"4444-5555-6666-7777");
		
		try {
			int amount= obj.pay("4444-5555-6666-7777",470000);
			System.out.println("인출액 : "+amount);
			System.out.println("카드번호 : "+obj.cardNo);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		};
	}
}
