package ex18_6_Buffered;

import java.io.*;

public class BufferReaderExample1_read {
	public static void main(String args[]) {

		BufferedReader reader = null;
		char arr[] = new char[64];

		int num = -1;

		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered/output2.dat"));
			while ((num = reader.read(arr)) != -1) {
				System.out.println(new String(arr, 0, num));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 없음");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을수 없음");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}
