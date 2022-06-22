//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader ������, read method ���� ó��

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample4_1 {
	public static void main(String argp[]) {
		FileReader reader = null;
		char [] arr = new char[64];
		try {
			reader = new FileReader("������ ��.txt");
			
			
			while (true) {
				//Returns : the number of characters read
				//arr�� �迭 ũ�� ��ŭ ���ڸ� �о� arr�� ������ ���� ������ ��ȯ�մϴ�.
				int num = reader.read(arr);
				if (num == -1) //���̻� ���� �����Ͱ� ���� ���
					break;
				
				for (int cnt =0; cnt<num ; cnt++) {
					System.out.printf("%c",arr[cnt]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		} catch (IOException e) { // read() �żҵ尡 �߻��� ���� ó��
			System.out.println("������ ������ �����ϴ�");
		} finally { //������ �ݴ� �꿵���� ������ ������� ó���ϱ� ���� finally ��Ͽ��� �����
			try {
				reader.close(); //������ �ݴ� ��ɹ�
			} catch (Exception e) { //close �޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println("Exception");
			}
		}
	}
}
