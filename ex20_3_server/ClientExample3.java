//ä�ø����
//Ŭ���̾�Ʈ

package ex20_3_server;

import java.net.*;

public class ClientExample3 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ�Դϴ�.~");

		Socket socket = null;

		try {
			// ������ �����մϴ�.
			socket = new Socket("127.0.0.1", 9001);
			//�ΰ��� �����带 �����մϴ�.
			Thread thread1 = new ReceiverThread(socket);
			Thread thread2 = new SenderThread(socket);
			//�ΰ��� �����带 �����մϴ�.
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //������ ������ �ȵ˴ϴ�.
	}
}
