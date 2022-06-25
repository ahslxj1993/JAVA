package ex18_3_1_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample1 {
	public static void main (String args[]) {
		if (args.length<1) {
			System.out.println("파일명을 Arguments탭에 output1.dat 라고 입력해주세요");
			return;
		}
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(args[0]);//파일을 연다
			//Run -> Run Configurations 에서 매개변수 값으로 output1.dat 입력
			
			byte arr[] = new byte[21];//바이트 단위로 데이터를 읽기 때문에 byte형 사용
			
			while(true) {
				int num = in.read(arr);//파일로부터 21바이트 읽는다.
				//int java.io.FileInputStream.read(byte[] b) throws IOException
				if(num<0)//읽어온 데이터가 -1이면 반복을 중단
					break;
				//읽어들인 바이트 데이터를 16진수로 출력한다.
				System.out.println("\n16진수 출력");
				for(int cnt =0 ; cnt<num ; cnt++)
					System.out.printf("%02X ", arr[cnt]);
				
				//%02X : 2자리 16진수(%X)로 출력하되,
				//대문자 (X가 대문자임)로 출력하면서 숫자가 한자리이면 앞자리를 0으로 채운다.
				//%02x : 2자리 16진수(%x)로 출력하되,
				//소문자 (x가 소문자임)로 출력하면서 숫자가 한자리이면 앞자리를 0으로 채운다.
				
				System.out.println("\n\n10진수 출력");
				for (int cnt =0 ; cnt<num ; cnt++)
					System.out.printf("%02d ",arr[cnt]);
				
				System.out.println("\n\n8진수 출력");
				for (int cnt =0 ; cnt<num ; cnt++)
					System.out.printf("%02o ",arr[cnt]);
			}
		}
		catch(FileNotFoundException fnfe){
			System.out.println(args[0]+"파일이 존재하지 않습니다.");
		}
		catch(IOException ioe) {
			System.out.println(args[0]+"파일을 읽을수 없습니다.");
		}finally {
			try {
				in.close();//파일을 닫습니다
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
