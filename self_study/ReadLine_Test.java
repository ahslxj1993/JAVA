package self_study;

import java.io.*;
import java.util.ArrayList;

import Homework001.Student2;

public class ReadLine_Test {
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\sijun\\eclipse-workspace\\Java\\jumsu.txt"));

			while (true) {
				String str = reader.readLine();

				if (str == null)
					break;
				
				String [] sep = str.split(" ");
				String name =sep[0];
				int kor = Integer.parseInt(sep[1]);
				int eng = Integer.parseInt(sep[2]);
				int math = Integer.parseInt(sep[3]);
				
				Student2 e = new Student2(name,kor,eng,math);
				list.add(e);
			}

		} catch (FileNotFoundException e) {
			System.out.println("no file");
		} catch (IOException ioe) {
			System.out.println("cannot read file");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e2) {
				System.out.println("error whule closing file");
			}
		}
	}
}
