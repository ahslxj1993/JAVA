//텍스트 파일을 읽는 프로그램 - 에러발생
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader 생성자, read method 예외 처리

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample4_2 {
	public static void main(String argp[]) {
		FileReader reader = null;
		char [] arr = new char[64];
		try {
			reader = new FileReader("거위의 꿈.txt");
			
			
			while (true) {
				//Returns : the number of characters read
				//arr의 배열 크기 만큼 문자를 읽어 arr에 저장후 읽은 개수를 반환합니다.
				int num = reader.read(arr);
				if (num == -1) //더이상 읽을 데이터가 없는 경우
					break;
				
				//arr의 0 부터 num개 만큼 스트링으로 만든후 출력
				System.out.print(new String(arr,0,num));
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
