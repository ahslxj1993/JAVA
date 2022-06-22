/*객체를 직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex18_6_Sterialization;

import java.io.*;
import java.util.*;

public class ObjecInputExample1 {
	public static void main(String args[]) {
		// 파일을 연다
		// ObjectOutputStream 클래스는 객체를 스트림으로 만들어서 출력하는기능이
		// 있는 클래스이다.
		// 이 클래스에는 데이터를 파일에 저장하는 기능이 없기 때문에
		// FileOutputStream 클래스와 함께 사용해야 한다.
		// FileOutputStream 객체를 생성해서
		// ObjectOutputStream 클래스의 생성자 파라미터로 넘겨주어야 한다
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
				// 객체를 역직렬화 하는 부분
				// readObject 메소드 : 입력된 스트림으로부터 객체를 만들어서 리턴하는 메소드로
				// 리턴타입은 Object 입니다.
				// 리턴 타입 Object를 원래의 클래스 타입으로 사용하기 위해 캐스트 연산을 해야합니다.
				// readObject()가 Object형 이므로 GregorianCalendar 타입으로 형변환 해야합니다.
				GregorianCalendar calendar =  (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int date = calendar.get(Calendar.DATE);

				System.out.println(year + "/" + month + "/" + date);
			}
		}catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
		} catch (EOFException eofe) {
			System.out.println("끝");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을수 없음");
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