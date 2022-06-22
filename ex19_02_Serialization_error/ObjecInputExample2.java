/*객체를 직렬화하는 프로그램
 * 직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요함
 * 이런 작업을 자바에서는 객체의 직렬화 라고 한다.
 * */

package ex19_02_Serialization_error;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecInputExample2 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println(obj.toString());
				
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