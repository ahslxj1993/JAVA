/*��ü�� ����ȭ�ϴ� ���α׷�
 * ����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ���
 * �̷� �۾��� �ڹٿ����� ��ü�� ����ȭ ��� �Ѵ�.
 * */

package ex18_6_Sterialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample1 {
	public static void main(String args[]) {
		// ������ ����
		// ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ���� ����ϴ±����
		// �ִ� Ŭ�����̴�.
		// �� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ���� ������
		// FileOutputStream Ŭ������ �Բ� ����ؾ� �Ѵ�.
		// FileOutputStream ��ü�� �����ؼ�
		// ObjectOutputStream Ŭ������ ������ �Ķ���ͷ� �Ѱ��־�� �Ѵ�
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));

			// ��ü�� ����ȭ �ϴ� �κ�
			// writeObject �޼ҵ� : �Ķ���ͷ� �Ѱ��� ��ü�� ��Ʈ������ ���� ����ϴ� �޼ҵ�
			// �Ķ���ͷ� ����� ��ü�� ���Ͽ� ����˴ϴ�.
			// GregorianCalendar ��ü�� �����ϼ� ���Ͽ� ���ϴ�.
			out.writeObject(new GregorianCalendar(2019, 0, 14));
			out.writeObject(new GregorianCalendar(2019, 0, 14));
			out.writeObject(new GregorianCalendar(2019, 0, 14));
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ��� �Ұ�");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println("������ �ݴ��� ���� �߻�");
			}
		}
	}
}