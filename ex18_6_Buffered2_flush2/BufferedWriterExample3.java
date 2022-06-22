package ex18_6_Buffered2_flush2;

import java.io.*;

public class BufferedWriterExample3 {
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
			bw.flush();
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����Ҽ� ����");
		} finally {
			try {
				fw.close(); // ���� ���ۿ� �����ִµ� ��½�Ʈ���� �ݾƹ���
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
