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
		System.out.println("제목 : "+title);
		System.out.println("보낸사람 : "+senderName);
		System.out.println("받는사람 : "+recipient);
		System.out.println("회신 이메일 : "+senderAddr);
		System.out.println("이메일 내용 : "+emailBody);
	}
	
	

}
