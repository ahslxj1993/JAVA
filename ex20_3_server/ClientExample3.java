//채팅만들기
//클라이언트

package ex20_3_server;

import java.net.*;

public class ClientExample3 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트입니다.~");

		Socket socket = null;

		try {
			// 소켓을 생성합니다.
			socket = new Socket("127.0.0.1", 9001);
			//두개의 스레드를 생성합니다.
			Thread thread1 = new ReceiverThread(socket);
			Thread thread2 = new SenderThread(socket);
			//두개의 스레드를 시작합니다.
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //소켓을 닫으면 안됩니다.
	}
}
