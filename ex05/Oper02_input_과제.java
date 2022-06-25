package ex05;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input_과제 {
	public static void main(String[]args) {
		InputStream is = System.in;
		
		Scanner sc = new Scanner(is);
		
		int number;
		double sight_left, sight_right;
		char alphabet = 0;
		String name,food,workout;
		boolean song;
		
		System.out.println("이름");
		name= sc.nextLine();
		
		System.out.println("좋아하는숫자");
		number = sc.nextInt();
		
		System.out.println("좌,우 시력 차례대로 입력");
		sight_left = sc.nextDouble();
		sight_right = sc.nextDouble();
		
		System.out.println("좋아하는 음식");
		sc.nextLine();
		food=sc.nextLine();
		
		System.out.println("좋아하는 운동");
		workout=sc.nextLine();

		System.out.println("좋아하는 알파벳");
		alphabet = sc.next().charAt(0);
		
		System.out.println("당신은 노래를 좋아하나요?(true, false)");
		song = sc.nextBoolean();
		
		
		

		System.out.println("\n\n이름: "+name);
		System.out.println("좋아하는숫자: "+number);
		System.out.println("좌측시력: "+sight_left);
		System.out.println("우측시력: "+sight_right);
		System.out.println("좋아하는 음식: "+food);
		System.out.println("좋아하는 운동: "+workout);
		System.out.println("좋아하는 알파벳: "+alphabet);
		System.out.println("노래를 좋아하나요?: "+song);
		
		
		sc.close();
	}

}
