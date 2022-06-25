package Homework002;

import java.io.*;

public class Main {
	public static void main(String args[]) {
		input();
	}


	// ����ȭ
	public static void write() {
		ObjectOutputStream out = null;
		BufferedReader reader = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			reader = new BufferedReader(new FileReader("jumsu.txt"));
			while (true) {
				String str = reader.readLine();
				if(str == null)
					break;
				String [] sep = str.split(" ");
				out.writeObject(new Student2(sep[0],Integer.parseInt(sep[1]),Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));
				}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ ����");
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ��ºҰ�");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// ������ȭ
	public static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
				Student2 s = (Student2) in.readObject();
				System.out.println(s.toString());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(in+"������ �������� �ʽ��ϴ�");
		} catch (EOFException eofe) {
			System.out.println(in+"��");
		} catch (IOException ioe) {
			System.out.println(in+"������ ������ �����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println(in+"�ش�Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				if(in !=null)
					in.close();
			} catch (Exception e) {
				System.out.println(in+"������ �ݴ��� ���� �߻�");
			}
		}
	}
}
