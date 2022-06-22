package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample9_1 {
	public static void main (String [] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없습니다.");
		}catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
	}
}
