/*객체를 직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex18_6_Sterialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample1 {
	public static void main(String args[]) {
		// 파일을 연다
		// ObjectOutputStream 클래스는 객체를 스트림으로 만들어서 출력하는기능이
		// 있는 클래스이다.
		// 이 클래스에는 데이터를 파일에 저장하는 기능이 없기 때문에
		// FileOutputStream 클래스와 함께 사용해야 한다.
		// FileOutputStream 객체를 생성해서
		// ObjectOutputStream 클래스의 생성자 파라미터로 넘겨주어야 한다
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));

			// 객체를 직렬화 하는 부분
			// writeObject 메소드 : 파라미터로 넘겨준 객체를 스트림으로 만들어서 출력하는 메소드
			// 파라미터로 념겨진 객체가 파일에 저장됩니다.
			// GregorianCalendar 객체를 생성하서 파일에 씁니다.
			out.writeObject(new GregorianCalendar(2019, 0, 14));
			out.writeObject(new GregorianCalendar(2019, 0, 14));
			out.writeObject(new GregorianCalendar(2019, 0, 14));
		} catch (IOException ioe) {
			System.out.println("파일로 출력 불가");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println("파일을 닫는중 오류 발생");
			}
		}
	}
}