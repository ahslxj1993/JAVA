//Ŭ������ ���丮 ����

package ex18_10_File;
import java.io.*;
public class FileExample2_1 {
	public static void main (String [] args) {
		
		String dir ="C:\\newDirectory";
		
		File f2 = new File(dir);
		
		if(!f2.exists()) { // C:\\newDirectory ���丮�� ���� ���
			if(f2.mkdir()) { //���丮 ���� - �����Ǹ� true �����ϸ� false
				System.out.println("���� ���� ���丮 �̸� : "+f2.getPath());
			} else {
				System.out.println("���丮 ������ �����߽��ϴ�.");
			}
		} else { // C:\\newDirectory ���丮�� �ִ� ���
			System.out.println("�̹� �ִ� ���丮 �̸� : "+f2.getPath());
		}
	}
}
