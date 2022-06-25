//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader ������, read method ���� ó��

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample2_1 {
	public static void main(String argp[]) {
		// 1. ������ ���ϴ�
		/*
		 * ������ ���ڰ����� ������ ��ġ�� �����մϴ�. �������: ����ο� ������ ����
		 * 1)����� : ������Ʈ ��θ� �������� ���ʴ�� ������ ��ġ�� �����մϴ�.
		 * 2)������ : ����̺� ����� ���ʴ�� ������ ��ġ�� �����մϴ�?
		 * 				��) d:/�۾�����/������Ʈ/poem.txt �ǹ�
		 */

		try {
			FileReader reader = new FileReader("poem.txt");
			//FileReader reader = new Filereader("D:/eclipse-workspace/Java/poem.txt");
			//FileReader reader = new Filereader("D:\\eclipse-workspace\\Java\\poem.txt");

			// ������ ����
			// FileReader reader=
			// new FileReader("D:/workspace_java/java/poem.txt");

			// 2. ������ �о ó���մϴ�
			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1) //���̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
			}

			// 3. ������ �ݽ��ϴ�.
			reader.close(); //���� read()�޼��忡�� ������ �߻��ϸ�
							//close() �޼��尡 ���� ���� ����ä ���α׷��� �����ϴ�.
		} catch (FileNotFoundException e) { //FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�");
		} catch (IOException e) { // read() �żҵ尡 �߻��� ���� ó��
			System.out.println("������ ������ �����ϴ�");
		}
	}
}
