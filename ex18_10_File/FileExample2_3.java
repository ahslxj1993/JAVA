//클래스로 파일, 디렉토리 생성 및 삭제 변경
package ex18_10_File;
import java.io.*;
public class FileExample2_3 {
	public static void main (String [] args) {
		
		String dir ="C:\\newDirectory\\newFile.txt";
		
		File f3 = new File(dir);
		
		if (f3.exists()) {
			if(f3.delete()) {
				System.out.println(f3.getPath()+" 삭제했습니다.");
			} else {
				System.out.println(f3.getPath() + " 삭제하지 못했습니다.");
			}
		}else {
			System.out.println(f3.getPath() + "에 삭제하고자 하는 파일이 없습니다.");
		}
	}
}
