//텍스트 파일을 읽는 프로그램 - 에러발생
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader 생성자, read method 예외 처리

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample3_1 {
	public static void main(String argp[]) {
		//reader 변수를 finally 문에서 사용하기위해 try 문 전에 선언
		FileReader reader = null;
		
		try {
			reader = new FileReader("poem2.txt");
			//reader = new FileReader(src/poem.txt);
			//reader = new Filereader("D:/eclipse-workspace/Java/poem.txt");
			//reader = new Filereader("D:\\eclipse-workspace\\Java\\poem.txt");

			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1) //더이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) { // read() 매소드가 발생한 예외 처리
			System.out.println("파일을 읽을수 없습니다");
		} finally { //파일을 닫는 멸영문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용함
			try {
				reader.close(); //파일을 닫는 명령문
			} catch (IOException e) { //close 메소드가 발생하는 예외 처리
				System.out.println("IOException");
			}
		}
	}
}
