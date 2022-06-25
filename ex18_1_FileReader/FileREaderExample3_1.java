//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader ������, read method ���� ó��

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample3_1 {
	public static void main(String argp[]) {
		//reader ������ finally ������ ����ϱ����� try �� ���� ����
		FileReader reader = null;
		
		try {
			reader = new FileReader("poem2.txt");
			//reader = new FileReader(src/poem.txt);
			//reader = new Filereader("D:/eclipse-workspace/Java/poem.txt");
			//reader = new Filereader("D:\\eclipse-workspace\\Java\\poem.txt");

			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1) //���̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		} catch (IOException e) { // read() �żҵ尡 �߻��� ���� ó��
			System.out.println("������ ������ �����ϴ�");
		} finally { //������ �ݴ� �꿵���� ������ ������� ó���ϱ� ���� finally ��Ͽ��� �����
			try {
				reader.close(); //������ �ݴ� ��ɹ�
			} catch (IOException e) { //close �޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println("IOException");
			}
		}
	}
}
