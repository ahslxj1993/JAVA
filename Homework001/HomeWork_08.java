package Homework001;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HomeWork_08 {
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();

		input(list);
		Student2.sort(list);
		print(list);

	}// main end

	static void input(ArrayList<Student2> as) {
		BufferedReader reader = null;
		String line = null;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\sijun\\eclipse-workspace\\Java\\jumsu.txt"));
			// 파일을 입력받기
			while ((line = reader.readLine()) != null) {
				StringTokenizer split = new StringTokenizer(line, " ");

				while (split.hasMoreTokens()) {
					String s1 = split.nextToken();
					String s2 = split.nextToken();
					String s3 = split.nextToken();
					String s4 = split.nextToken();
					// 문자열 나누기

					String name = s1;
					int kor = Integer.parseInt(s2);
					int eng = Integer.parseInt(s3);
					int math = Integer.parseInt(s4);
					// 나눠진 문자열 정수형으로 변환하기

					Student2 e = new Student2(s1, kor, eng, math);
					// Student2 자료형을 가진 e 선언
					as.add(e);
					// list에 e 넣기
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 없음");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을수 없음");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}// input end

	static void print(ArrayList<Student2> as) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (int cnt = 0; cnt < as.size(); cnt++) {
			System.out.println(as.get(cnt));
		}
	}// print end
}
