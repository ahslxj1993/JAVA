package ex12_1_Exception;

import java.io.*;


public class ExceptionExample9_2 {
	public static void main (String [] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}catch(Exception e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}
