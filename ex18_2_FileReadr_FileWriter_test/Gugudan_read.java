package ex18_2_FileReadr_FileWriter_test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gugudan_read {
	public static void main (String [] args) {
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:\\Users\\sijun\\eclipse-workspace\\Java\\src\\ex18_2_FileReadr_FileWriter_test\\gugudan.txt");

			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1) //더이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
				//System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) { // read() 매소드가 발생한 예외 처리
			System.out.println("파일을 읽을수 없습니다");
		} finally { //파일을 닫는 멸영문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용함
			try {
				reader.close(); //파일을 닫는 명령문
			} catch (Exception e) { //close 메소드가 발생하는 예외 처리
				System.out.println("Exception");
			}
		}
	}
}
