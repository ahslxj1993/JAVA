/*객체를 역직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex19_07_serialVersionUID;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecInputExample {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			while (true) {
				Rectangle obj = (Rectangle) in.readObject();// 객체를 역직렬화 하는 부분
				System.out.println(obj.toString());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		} catch (EOFException eofe) {
			System.out.println("끝");
		} catch (IOException ioe) {
			//직렬화 할때 사용한 클래스와 역직렬화 할때 사용한 클래스의 버전이 
			//다를때 발생하는 에러 메세지 출력하는곳
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				System.out.println("파일을 닫는중 오류 발생");
			}
		}
	}
}