package ex08_08_abstract_class;

public class InheritanceExample6 {
	public static void main (String [] args) {
		EMailSender obj1 = new EMailSender("������ �����մϴ�","������","admin@khsop.co.kr","10���� ���������� ����Ǿ����ϴ�");
		
		obj1.sendMessage("hoho@naver.com");
		
		SMSSender obj2  = new SMSSender("������ �����մϴ�","������","02-123-4567","10���� ���������� ����Ǿ����ϴ�");
		
		obj2.sendMessage("010-123-1234");
	}
}
