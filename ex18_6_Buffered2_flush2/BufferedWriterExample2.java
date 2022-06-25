package ex18_6_Buffered2_flush2;

import java.io.*;

public class BufferedWriterExample2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("src/ex18_6_Buffered2_flush2/output.txt");
			//�ι�° ���ڴ� ���ۻ���� �ǹ� - ���ۿ� 5���� ���ڸ� �����Ҽ� �ִ�.
			bw = new BufferedWriter(fw, 5);

			char arr[] = { '��', '��', '��', '1', '��',
					'2', '��', '��', '3', '��',
					'��', '4', '��', '��', '5',
					'��', '��', '6','��' };

			for (int cnt = 0; cnt < arr.length; cnt++) {
				bw.write(arr[cnt]);
			}
		/*
		 * ���ۿ� �ִ� �����͸� ���Ͽ� ��� ����ϵ��� �ϴ� �޼ҵ��Դϴ�.
		 * */
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����Ҽ� ����");
		} finally {
			try {
				bw.close(); // ���� ��� ��Ʈ���� ���������� ������
							// �ڵ����� flush() �޼ҵ带 ȣ���մϴ�.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
