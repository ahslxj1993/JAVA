package ex08_13_02_polymorphism_error;

abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String sendername){
		this.title= title;
		this.senderName = sendername;
	}
	
	//abstract void sendMessage(String recipient);
}
