//Ŭ������ ���ϻ���
package ex18_10_File;
import java.io.*;
public class FileExample2_2 {
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
		
		//���ϰ�ü ����
		File f = new File(dir+"\\newFile.txt");
		
		if(f.exists()) {
			System.out.println(f.getPath()+"��ο� "+f.getName()+"������ �ֽ��ϴ�.");
		}
		else {
			try {
				//IOException �߻�
				//boolean java.io.File.createNewFile() throws IOException
				if(f.createNewFile()) { //���ϻ���
					System.out.println(f.getPath()+"�� ���ο� ������ ��������ϴ�.");
				}
			} catch(IOException e) {
				System.out.println("IOException �߻��߽��ϴ�.");
			}
		}
	}
}
