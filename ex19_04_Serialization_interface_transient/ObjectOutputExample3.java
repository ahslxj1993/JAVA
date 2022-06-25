/*��ü�� ����ȭ�ϴ� ���α׷�
 * ����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ���
 * �̷� �۾��� �ڹٿ����� ��ü�� ����ȭ ��� �Ѵ�.
 * */

package ex19_04_Serialization_interface_transient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("ȫ�浿","HTA-L2","7�� ����","������ �Ҽ��ִ� ���");
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