//FileWriter Ŭ������ �̿��ؼ� ���� �����͸� ���Ͽ� ���� ���α׷�

/*
 * java.lang.Object
 * 	java.io.Writer
 * 		java.io.OutputStreamWriter
 * 			java.io.FileWriter
 * */
/*
 *  output.txt�� Ȯ���ϴ¹�
 *  
 *  1.��Ŭ���� Package Explorer���� Java ������Ʈ���� ���ΰ�ħ ������ ���
 *  2.��Ŭ���� window �޴� - Preferneces - General
 *   	- Workspace - Refresh using native hooks or polling ����
 * */

package ex18_1_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
	public static void main (String [] args) {
		FileWriter writer = null;
		
		try {
			//true : append (���� �ִ� ���� ���� �ڿ� �߰��� ����)
			//false : overwrite(������Ѵ�.)
			writer = new FileWriter("output.txt",true);
			//public FileWirter(String fileName) throws IOException
			//FileWriter �����ڴ� IOexcpeiton ������ �߻��ϱ� ������
			//IOExcepiton ó������ �־�� �մϴ�.
			
			char arr[] = {'��','��',' ','��','��','��'};
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�
			for (int cnt =0 ; cnt<arr.length; cnt++)
				writer.write(arr[cnt]);
			
			writer.write("\n");
			//�� �ι���� ���� �ǹ�
			//writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����Ҽ� �����ϴ�.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e){
				System.out.println("���� �ݴ��� �����Դϴ�,.");
			}
		}
	}
}
