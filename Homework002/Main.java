package Homework002;

import java.io.*;

public class Main {
	public static void main(String args[]) {
		input();
	}


	// 직렬화
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
			System.out.println("파일이 없음");
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력불가");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// 역직렬화
	public static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
				Student2 s = (Student2) in.readObject();
				System.out.println(s.toString());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(in+"파일이 존재하지 않습니다");
		} catch (EOFException eofe) {
			System.out.println(in+"끝");
		} catch (IOException ioe) {
			System.out.println(in+"파일을 읽을수 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println(in+"해당클래스가 존재하지 않습니다.");
		} finally {
			try {
				if(in !=null)
					in.close();
			} catch (Exception e) {
				System.out.println(in+"파일을 닫는중 오류 발생");
			}
		}
	}
}
