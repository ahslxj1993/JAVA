package ex19_02_Serialization_error;
import java.io.*;
public class ObjectOutputExample2 {
	public static void main (String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			out.writeObject(new GoodsStock("70101",100));
			out.writeObject(new GoodsStock("70102",50));
			out.writeObject(new GoodsStock("70103",200));
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할수가 없습니다");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e) {
				System.out.println("파일 닫는중 오류");
			}
		}//finally end
	}//main end
}//class end
