/*객체를 직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex19_06_serialVersionUID_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String args[]) {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj);//객체를 직렬화 하는 부분
		} catch (IOException ioe) {
			System.out.println("파일로 출력 불가");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
