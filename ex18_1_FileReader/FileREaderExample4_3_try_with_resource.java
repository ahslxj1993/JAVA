//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader ������, read method ���� ó��

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample4_3_try_with_resource {
	public static void main(String args[]) {
		char[] arr = new char[64];// ���Ͽ� �ִ� ���ڸ� ���� char�迭
		/*
		 * 1.try-with-resource ������ try() ��ȣ �ȿ� ����� �ڿ��� try���� ������ �ڵ����� close()�޼��带 ȣ���մϴ�.
		 * 
		 * 2.try-with-resource ���� ���� �ڵ����� ��ü�� close()�� ȣ��ɼ� �������� Ŭ������ AutoCloseable �̶��
		 * �������̽��� ������ ���̾�� �մϴ�.
		 * 
		 * ����) try(){ ...... }catch(){ ..... }finally{}
		 */

		try (FileReader reader = new FileReader("������ ��.txt")) {
			while (true) {
				// Returns : the number of characters read
				int num = reader.read(arr);

				if (num == -1) // ���̻� ���� �����Ͱ� ���� ���
					break;

				// arr�� 0 ���� num�� ��ŭ ��Ʈ������ ������ ���
				System.out.print(new String(arr, 0, num));
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		} catch (IOException e) { // read() �żҵ尡 �߻��� ���� ó��
			System.out.println("������ ������ �����ϴ�");
		} finally {
			System.out.println("Final �Դϴ�.");
		}
	}
}
