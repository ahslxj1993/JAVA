/*��ü�� ����ȭ�ϴ� ���α׷�
 * ����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ���
 * �̷� �۾��� �ڹٿ����� ��ü�� ����ȭ ��� �Ѵ�.
 * */

package ex18_6_Sterialization;

import java.io.*;
import java.util.*;

public class ObjecInputExample1 {
	public static void main(String args[]) {
		// ������ ����
		// ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ���� ����ϴ±����
		// �ִ� Ŭ�����̴�.
		// �� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ���� ������
		// FileOutputStream Ŭ������ �Բ� ����ؾ� �Ѵ�.
		// FileOutputStream ��ü�� �����ؼ�
		// ObjectOutputStream Ŭ������ ������ �Ķ���ͷ� �Ѱ��־�� �Ѵ�
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
				// ��ü�� ������ȭ �ϴ� �κ�
				// readObject �޼ҵ� : �Էµ� ��Ʈ�����κ��� ��ü�� ���� �����ϴ� �޼ҵ��
				// ����Ÿ���� Object �Դϴ�.
				// ���� Ÿ�� Object�� ������ Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ��մϴ�.
				// readObject()�� Object�� �̹Ƿ� GregorianCalendar Ÿ������ ����ȯ �ؾ��մϴ�.
				GregorianCalendar calendar =  (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int date = calendar.get(Calendar.DATE);

				System.out.println(year + "/" + month + "/" + date);
			}
		}catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		} catch (EOFException eofe) {
			System.out.println("��");
		} catch (IOException ioe) {
			System.out.println("������ ������ ����");
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