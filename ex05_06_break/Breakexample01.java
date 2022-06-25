package ex05_06_break;

public class Breakexample01 {
	public static void main(String args[]) {
		for (int i=1; i<2; i++) {
				System.out.print('*');
			}
		System.out.println();
		for (int i=1; i<3; i++) {
			System.out.print('*');
		}
		System.out.println();
		for (int i=1; i<4; i++) {
			System.out.print('*');
		}
		System.out.println();
		for (int i=1; i<5; i++) {
			System.out.print('*');
		}
		System.out.println();
		for (int i=1; i<6; i++) {
			System.out.print('*');
		}
		System.out.println("\n=====================");
		
		int line=5;
		for (int i =5; i >=1; i--) {
			for (int j =5 ; j>=line+1-i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
