/*객체를 직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex19_04_Serialization_interface_transient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("홍길동","HTA-L2","7월 모임","집에서 할수있는 취미");
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