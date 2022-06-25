package ex08_08_abstract_class;

public class InheritanceExample6 {
	public static void main (String [] args) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다","고객센터","admin@khsop.co.kr","10프로 할인쿠폰이 발행되었습니다");
		
		obj1.sendMessage("hoho@naver.com");
		
		SMSSender obj2  = new SMSSender("생일을 축하합니다","고객센터","02-123-4567","10프로 할인쿠폰이 발행되었습니다");
		
		obj2.sendMessage("010-123-1234");
	}
}
