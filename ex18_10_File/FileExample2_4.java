//클래스로 파일, 디렉토리 생성 및 삭제 변경
package ex18_10_File;
import java.io.*;
public class FileExample2_4 {
	public static void main (String [] args) {
		//디렉토리 삭제
		/*
		 * boolean java.io.File.delete() : 디렉토리 삭제합니다.
		 * 단 디렉토리 안에 파일이 있으면 삭제하지 못합니다.
		 * 이때 반환값은 false가 됩니다.
		 * */
		String dir ="C:\\newDirectory\\";
		
		File f4 = new File(dir);
		
		if (f4.exists()) {
			if(f4.delete()) {
				System.out.println(f4.getPath()+" 삭제했습니다.");
			} else {
				System.out.println(f4.getPath() + " 삭제하지 못했습니다.");
			}
		}else {
			System.out.println(f4.getPath() + "에 삭제하고자 하는 디렉토리가"
					+ " 없습니다.");
		}
	}
}
