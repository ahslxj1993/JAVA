/*��ü�� ������ȭ�ϴ� ���α׷�
 * ����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ���
 * �̷� �۾��� �ڹٿ����� ��ü�� ����ȭ ��� �Ѵ�.
 * */

package ex19_07_serialVersionUID;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecInputExample {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			while (true) {
				Rectangle obj = (Rectangle) in.readObject();// ��ü�� ������ȭ �ϴ� �κ�
				System.out.println(obj.toString());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		} catch (EOFException eofe) {
			System.out.println("��");
		} catch (IOException ioe) {
			//����ȭ �Ҷ� ����� Ŭ������ ������ȭ �Ҷ� ����� Ŭ������ ������ 
			//�ٸ��� �߻��ϴ� ���� �޼��� ����ϴ°�
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش�Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				System.out.println("������ �ݴ��� ���� �߻�");
			}
		}
	}
}