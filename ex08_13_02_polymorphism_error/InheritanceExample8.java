package ex08_13_02_polymorphism_error;

public class InheritanceExample8 {
	public static void main (String args[]) {
		EMailSender obj1 = new EMailSender("������ �����մϴ�","������","admin@dukeeshop.co.kr","10%���� ������ ����Ǿ����ϴ�.");
		
		SMSSender obj2  = new SMSSender("������ �����մϴ�","������","02-0000-0000","10%���� ������ ����Ǿ����ϴ�.");
		
		//����Ŭ���� ��ü obj1, obj2�� ������ �޼ҵ带 ȣ��
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");
	}
	
		/*
		 * 1. MessageSender obj : ���� Ŭ���� Ÿ���� �Ķ����
		 * 
		 * 2. MessageSender Ŭ�������� SendMessage �޼��带 �ּ� ó���� ��� ���� �߻��մϴ�
		 * 
		 * 3.�ڹ� �����Ϸ��� ������ Ÿ������ �� �޼��尡 �ִ��� ������ üũ�մϴ�.
		 * MessageSender�� sendMessage()�޼��尡 �������� �ʾƼ�
		 * the method sendMessage(String) ins undefined for the type
		 * �����߻� �߽��ϴ�
		 * 
		 * 4.�ڹ� ���� ���(JVM)�� ��ü�� �޼��带 ȣ�� �Ҷ� ������ Ÿ�Կ� ��� ����
		 * ��ü�� ���ϴ� Ŭ������ �޼ҵ带 ȣ���մϴ�.
		 */
		static void send(MessageSender obj , String recipent) {
			obj.sendMessage(recipent);
		}
}
