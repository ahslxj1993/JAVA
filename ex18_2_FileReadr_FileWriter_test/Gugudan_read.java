package ex18_2_FileReadr_FileWriter_test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gugudan_read {
	public static void main (String [] args) {
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:\\Users\\sijun\\eclipse-workspace\\Java\\src\\ex18_2_FileReadr_FileWriter_test\\gugudan.txt");

			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1) //���̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
				//System.out.print((char)data);
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
