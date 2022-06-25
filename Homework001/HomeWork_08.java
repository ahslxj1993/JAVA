package Homework001;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HomeWork_08 {
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();

		input(list);
		Student2.sort(list);
		print(list);

	}// main end

	static void input(ArrayList<Student2> as) {
		BufferedReader reader = null;
		String line = null;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\sijun\\eclipse-workspace\\Java\\jumsu.txt"));
			// ������ �Է¹ޱ�
			while ((line = reader.readLine()) != null) {
				StringTokenizer split = new StringTokenizer(line, " ");

				while (split.hasMoreTokens()) {
					String s1 = split.nextToken();
					String s2 = split.nextToken();
					String s3 = split.nextToken();
					String s4 = split.nextToken();
					// ���ڿ� ������

					String name = s1;
					int kor = Integer.parseInt(s2);
					int eng = Integer.parseInt(s3);
					int math = Integer.parseInt(s4);
					// ������ ���ڿ� ���������� ��ȯ�ϱ�

					Student2 e = new Student2(s1, kor, eng, math);
					// Student2 �ڷ����� ���� e ����
					as.add(e);
					// list�� e �ֱ�
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ ����");
		} catch (IOException ioe) {
			System.out.println("������ ������ ����");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}// input end

	static void print(ArrayList<Student2> as) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (int cnt = 0; cnt < as.size(); cnt++) {
			System.out.println(as.get(cnt));
		}
	}// print end
}
