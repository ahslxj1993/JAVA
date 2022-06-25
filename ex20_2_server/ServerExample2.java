package ex20_2_server;

import java.io.*;
import java.net.*;

public class ServerExample2 {
	public static void main (String [] args) {
		System.out.println("����� �����Դϴ�.~");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);//���� ������ �����մϴ�.
			socket = serverSocket.accept();
			
			/*InputStreamReader Ŭ���� :
			 *  ����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
			 *  ��Ŭ������ �����ڿ� �������κ��� ���� InputStream ��ü�� �Ѱ��ָ�
			 *  ��Ʈ��ũ�� ���ŵ� �����͸� ���ڽ�Ʈ�� ���·� �������ִ�
			 *  InputStreamReader ��ü�� �����˴ϴ�.
			 * */
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			/*PrinterWriter Ŭ������ �̿��Ͽ� ���ڽ�Ʈ���� ����Ʈ��Ʈ������ �ٲپ
			 * ����ϱ� ���ؼ��� �� Ŭ������ �����ڿ� OutputStream Ÿ���� ��ü��
			 * �Ķ���ͷ� �Ѱ��־�� �մϴ�
			 * */
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			String str = reader.readLine();//�����͸� �����մϴ�.
			
			System.out.println(str);//�����͸� ȭ�鿡 ����մϴ�
			
			writer.println("Hello,Client2");//�����͸� �۽��մϴ�.
			
			/*PrintWriter Ŭ������ println()�޼ҵ�� ���ڿ��� ����ϸ� �� ���ڿ���
			 * �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �������� ������ٰ�
			 * �Ѳ����� �۽ŵ˴ϴ�.
			 * �׷��� println() �޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ��� 
			 * flush �޼ҵ带 ȣ���ؾ� �մϴ�.
			 * */
			writer.flush();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//������ �ݽ��ϴ�.
			} catch(Exception ignored) {
				System.out.println("������ �ݴ��� ������ �߻��߽��ϴ�.");
			}
			
			try {
				serverSocket.close();//���� ������ �ݽ��ϴ�.
			} catch(Exception ignored) {
				System.out.println("���� ������ �ݴ��� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
