package ex20_3_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	private Socket socket;

	SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		PrintWriter writer = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));

			writer = new PrintWriter(socket.getOutputStream());

			while (!socket.isClosed()) {
				// 키보드로부터 문자열을 입력받습니다.
				String str = reader.readLine();

				// 사용자가 "bye"라고 입력하면 반복문을 빠져나갑니다.
				if (str.equals("bye"))
					break;

				// 입력된 문자열을 송신합니다.
				writer.println(str);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				 writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				 reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
