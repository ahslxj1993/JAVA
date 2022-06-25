package ex08_13_02_polymorphism_error;

class EMailSender extends MessageSender{
	String senderAddr;
	String emailBody;
	
	EMailSender(String title, String sendername, String senderAddr,
			String emailBody) {
		super(title, sendername);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	
	void sendMessage(String recipient) {
		System.out.println("---------------------");
		System.out.println("���� : "+title);
		System.out.println("������� : "+senderName);
		System.out.println("�޴»�� : "+recipient);
		System.out.println("ȸ�� �̸��� : "+senderAddr);
		System.out.println("�̸��� ���� : "+emailBody);
	}
	
	

}
