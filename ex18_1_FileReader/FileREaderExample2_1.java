//텍스트 파일을 읽는 프로그램 - 에러발생
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader 생성자, read method 예외 처리

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample2_1 {
	public static void main(String argp[]) {
		// 1. 파일을 엽니다
		/*
		 * 생성자 인자값으로 파일의 위치를 저장합니다. 지정방법: 상대경로와 절대경로 지정
		 * 1)상대경로 : 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다.
		 * 2)절대경로 : 드라이브 명부터 차례대로 파일의 위치를 지정합니다?
		 * 				예) d:/작업폴더/프로젝트/poem.txt 의미
		 */

		try {
			FileReader reader = new FileReader("poem.txt");
			//FileReader reader = new Filereader("D:/eclipse-workspace/Java/poem.txt");
			//FileReader reader = new Filereader("D:\\eclipse-workspace\\Java\\poem.txt");

			// 절대경로 지정
			// FileReader reader=
			// new FileReader("D:/workspace_java/java/poem.txt");

			// 2. 파일을 읽어서 처리합니다
			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1) //더이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}

			// 3. 파일을 닫습니다.
			reader.close(); //만약 read()메서드에서 오류가 발생하면
							//close() 메서드가 실행 되지 않은채 프로그램이 끝납니다.
		} catch (FileNotFoundException e) { //FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) { // read() 매소드가 발생한 예외 처리
			System.out.println("파일을 읽을수 없습니다");
		}
	}
}
