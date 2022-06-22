//텍스트 파일을 읽는 프로그램 - 에러발생
/*java.lang.Object
 * 	java.io.Reader
 * 		java.io.InputStreamReader
 * 			java.io.FileReader
 * */

//FileReader 생성자, read method 예외 처리

package ex18_1_FileReader;

import java.io.*;

public class FileREaderExample4_3_try_with_resource {
	public static void main(String args[]) {
		char[] arr = new char[64];// 파일에 있는 문자를 담을 char배열
		/*
		 * 1.try-with-resource 문으로 try() 괄호 안에 선언된 자원은 try문이 끝날때 자동으로 close()메서드를 호출합니다.
		 * 
		 * 2.try-with-resource 문에 의해 자동으로 객체의 close()가 호출될수 있으려면 클래스가 AutoCloseable 이라는
		 * 인터페이스를 구현한 것이어야 합니다.
		 * 
		 * 형식) try(){ ...... }catch(){ ..... }finally{}
		 */

		try (FileReader reader = new FileReader("거위의 꿈.txt")) {
			while (true) {
				// Returns : the number of characters read
				int num = reader.read(arr);

				if (num == -1) // 더이상 읽을 데이터가 없는 경우
					break;

				// arr의 0 부터 num개 만큼 스트링으로 만든후 출력
				System.out.print(new String(arr, 0, num));
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) { // read() 매소드가 발생한 예외 처리
			System.out.println("파일을 읽을수 없습니다");
		} finally {
			System.out.println("Final 입니다.");
		}
	}
}
