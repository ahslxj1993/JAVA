/*��ü�� ����ȭ�ϴ� ���α׷�
 * ����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ���
 * �̷� �۾��� �ڹٿ����� ��ü�� ����ȭ ��� �Ѵ�.
 * */

package ex19_06_serialVersionUID_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String args[]) {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj);//��ü�� ����ȭ �ϴ� �κ�
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ��� �Ұ�");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
