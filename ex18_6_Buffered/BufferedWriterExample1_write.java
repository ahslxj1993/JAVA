package ex18_6_Buffered;
import java.io.*;
public class BufferedWriterExample1_write {
	public static void main (String [] args) {
		String message = "하하입니다. \n오늘도 화이팅입니다.";
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_6_Buffered/output2.dat"));
			writer.write(message);
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽을수없습니다.");
		}
		finally {//파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용함
			try {
				writer.close();//파일을 닫는 명령문
			}
			catch(Exception e) {//close 메소드가 발생하는 예외처리
				System.out.println("닫는중 오류가 발생했습니다.");
			}
		}
	}
}
