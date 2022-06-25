package ex08_13_01_polymorphism;

abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String sendername){
		this.title= title;
		this.senderName = sendername;
	}
	
	abstract void sendMessage(String recipient);
}
