package ex18_3_1_FileInputStream_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample1 {
	public static void main (String [] args) {
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("output1.dat");//open file
			byte arr [] = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ,
					 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 };
			
			//������ �ݺ��ؼ� byte Ÿ�� �����͸� ����.
			for (int cnt =0 ; cnt<arr.length; cnt++) {
				out.write(arr[cnt]);
			}
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ����Ҽ� �����ϴ�.");
		}
		finally {
			try {
				out.close();//close file
				System.out.println("������ �����߽��ϴ�.");
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
