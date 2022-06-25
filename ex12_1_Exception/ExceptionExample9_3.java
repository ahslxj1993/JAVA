package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample9_3 {
	public static void main (String [] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}catch(FileNotFoundException e){
			System.out.println("������ ã���� �����ϴ�.");
		}
	}
}
