package ex06_01_array;

import java.util.Scanner;

public class stringarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int index = -1;
		String names[] = { "홍길동", "전우치", "홍길동", "세종대왕", "김길동" };
		System.out.println("검색할 이름을 입력하세요");

		System.out.print("이름:");
		String inputname = sc.next();
		
		for (int i=0 ;i<names.length;i++) {
			if (inputname.equals(names[i])) {
				index =i; break;
			} 
		}
		
		if (index != -1)
			System.out.println(inputname +"는 배열의 인덱스"+index+"에서 찾았습니다.");
		else
			System.out.println(inputname+"는 배열방에서 찾지 못했습니다.");
		sc.close();
	}

}
