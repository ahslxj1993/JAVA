package ex20_2_server;

import java.io.*;
import java.net.*;

public class ClientExample2 {
	public static void main (String [] args) {
		System.out.println("����� Ŭ���̾�Ʈ�Դϴ�.~");
		
		Socket socket = null;
		
		try {
			//������ �����մϴ�.
			socket = new Socket("127.0.0.1",9001);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//�����͸� �۽��մϴ�.
			//println �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �������� ������ٰ�  �Ѳ����� �۽ŵ˴ϴ�.
			//�׷��� ������ println �޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ��� flush �޼ҵ带 ȣ���ؾ��մϴ�.
			writer.println("Hello, Server2");
			writer.flush();
			
			//�����͸� �����մϴ�
			String str = reader.readLine();
			//���ŵ����͸� ����մϴ�.
			System.out.println(str);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//������ �ݽ��ϴ�.
			} catch(Exception ignored) {
				System.out.println("������ �ݴ��� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
