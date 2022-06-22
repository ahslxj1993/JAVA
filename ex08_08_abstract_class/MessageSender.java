package ex08_08_abstract_class;

abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String sendername){
		this.title= title;
		this.senderName = sendername;
	}
	
	abstract void sendMessage(String recipient);
}
