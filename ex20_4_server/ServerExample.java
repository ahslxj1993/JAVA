//ä�ø����
//����

package ex20_4_server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		System.out.println("����� �����Դϴ�.~");

		ServerSocket serverSocket = null;

		try {
			// �� ������ while���� ���� �ʵ��� �������ּ���. ���������� �Ѱ� ���� ����մϴ�.
			serverSocket = new ServerSocket(9000);// ���� ������ �����մϴ�.
			while (true) {
				// �����û�� ���� ������ �����մϴ�.
				// accept �޼ҵ�: ���� �������� ���� ��û�� ������ ������ �ΰ�
				// Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼ҵ�
				Socket socket = serverSocket.accept();

				// ��û�� �ö����� ������ ����
				Thread thread = new PerClientThread(socket);
				thread.start();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
