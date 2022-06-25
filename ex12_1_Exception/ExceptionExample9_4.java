package ex12_1_Exception;

import java.io.*;

public class ExceptionExample9_4 {
	public static void main (String [] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("some.txt");
		}catch(IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		}finally {
			
			try {
				if (reader !=null) 
					reader.close();
			} catch (IOException e) {
				System.err.println("파일을 닫는중 오류가 발생했습니다.");
			}
		}
	}
}
