package ex20_4_server;

import java.io.*;
import java.net.*;

public class ReceiverThread extends Thread {
	private Socket socket;

	ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	/*
	 * ��� : Ŭ���̾�Ʈ�κ��� �޽����� ����(reader.readLine())�ؼ� ����ͷ� ����մϴ�. ������ ������ �������� ���ŵ� ���ڿ���
	 * null�Դϴ�. null�̸� �ݺ����� ����ϴ�. ��¹�)System.out.println("����>" + str);
	 */
	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {

				String str = reader.readLine();

				// ������ ������ �������� null�� �����մϴ�.
				if (str == null)
					break;

				// ���ŵ� �޽����� ����ͷ� ����մϴ�.
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
