//FileWriter 클래스를 이용해서 문자 데이터를 파일에 쓰는 프로그램

/*
 * java.lang.Object
 * 	java.io.Writer
 * 		java.io.OutputStreamWriter
 * 			java.io.FileWriter
 * */
/*
 *  output.txt를 확인하는법
 *  
 *  1.이클립스 Package Explorer에서 Java 프로젝트에서 새로고침 누르는 방법
 *  2.이클립스 window 메뉴 - Preferneces - General
 *   	- Workspace - Refresh using native hooks or polling 선택
 * */

package ex18_1_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main (String [] args) {
		FileWriter writer = null;
		
		try {
			//생성자의 매개변수가 열 파일의 이름을 의미합니다.
			//output.txt 파일이 없는 경우는 파일 생성후 파일이 열립니다.
			//만약 이름이 있는 경우 기존 파일의 내용이 지워집니다.
			
			writer = new FileWriter("output.txt");
			//public FileWirter(String fileName) throws IOException
			//FileWriter 생성자는 IOexcpeiton 에러를 발생하기 때문에
			//IOExcepiton 처리문이 있어야 합니다.
			
			char arr[] = {'내','꺼','인',' ','듯',' ','내','꺼',' ','아','닌',' ','내','꺼',' ','같','은',' ','너'};
			
			//파일에 반복해서 문자들을 씁니다
			for (int cnt =0 ; cnt<arr.length; cnt++)
				writer.write(arr[cnt]);
			//위 두문장과 같은 의미
			//writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("파일로 출력할수 없습니다.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e){
				System.out.println("파일 닫는중 오류입니다,.");
			}
		}
	}
}
