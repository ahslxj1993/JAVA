//Ŭ������ ����, ���丮 ���� �� ���� ����
package ex18_10_File;
import java.io.*;
public class FileExample2_4 {
	public static void main (String [] args) {
		//���丮 ����
		/*
		 * boolean java.io.File.delete() : ���丮 �����մϴ�.
		 * �� ���丮 �ȿ� ������ ������ �������� ���մϴ�.
		 * �̶� ��ȯ���� false�� �˴ϴ�.
		 * */
		String dir ="C:\\newDirectory\\";
		
		File f4 = new File(dir);
		
		if (f4.exists()) {
			if(f4.delete()) {
				System.out.println(f4.getPath()+" �����߽��ϴ�.");
			} else {
				System.out.println(f4.getPath() + " �������� ���߽��ϴ�.");
			}
		}else {
			System.out.println(f4.getPath() + "�� �����ϰ��� �ϴ� ���丮��"
					+ " �����ϴ�.");
		}
	}
}
