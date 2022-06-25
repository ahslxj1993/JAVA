package ex18_3_1_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_image {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Argument�� ù��°�� �������� �ι�°�� ���������� �־��ּ���");
			System.exit(0);
		}
		
		FileInputStream original = null;
		FileOutputStream copy = null;
		
		try {
			original = new FileInputStream(args[0]);
			copy = new FileOutputStream(args[1]);
			
			byte[] readBytes = new byte[1024];
			
			int readCount;
			
			while(true) {
				readCount = original.read(readBytes);
				
				if(readCount == -1)
					break;
				//copy.write(readBytes,0,readCount);
				copy.write(readBytes);
			}
			System.out.println("���� ���� �Ϸ�");
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ ����");
		}catch (IOException ioe) {
			System.out.println("������ ������ ����");
		}finally {
			try {
				if(original !=null)
					original.close();
			}
			catch (Exception e) {
				e.printStackTrace();;
			}
			
			try {
				if(copy !=null)
					copy.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
