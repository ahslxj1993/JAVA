//ä�ø����
//Ŭ���̾�Ʈ

package ex20_4_server;

import java.net.*;

public class ClientExample {
	public static void main(String[] args) {
		//args�Ķ���ͷ� ��ȭ���� �Է¹޽��ϴ�.
		if(args.length != 1) {
			System.out.println("��ȭ���� �Է��ϼ���");
			return;
		}
		
		try {
			//������ ������ �ν��ϴ�
			Socket socket = new Socket("127.0.0.1", 9000);
			//�޼��� �۽� ������ ����
			Thread thread1 = new SenderThread(socket, args[0]);
			//�޼��� ���� ������ ����
			Thread thread2 = new ReceiverThread(socket);
			//������ ����
			thread1.start();
			thread2.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
