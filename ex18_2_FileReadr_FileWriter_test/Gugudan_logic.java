package ex18_2_FileReadr_FileWriter_test;

import java.io.FileWriter;
import java.io.IOException;

public class Gugudan_logic {
	public static void main(String [] args) {
		FileWriter writer = null;
		
		try {
			
			writer = new FileWriter("C:\\Users\\sijun\\eclipse-workspace\\Java\\src\\ex18_2_FileReadr_FileWriter_test\\gugudan.txt");
			
			
			for(int dan =2; dan<=9; dan++) {
				writer.write("["+dan+"]단"+"\t");
			}
			
			writer.write("\n");
			for(int i =1; i<=9 ; i++) {
				for (int j =2; j<=9 ; j++) {
					writer.write(j+"*"+i+"="+(j*i)+"\t");
				}
				writer.write("\n");
			}
		}
		catch(IOException ioe) {
			System.out.println("파일로 출력할수 없었습니다.");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("파일을 닫는중 오류가 발생했습니다.");
			}
		}
		
		

	}
}
