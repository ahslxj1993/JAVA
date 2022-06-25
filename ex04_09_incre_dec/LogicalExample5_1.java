package ex04_09_incre_dec;

public class LogicalExample5_1 {
	public static void main(String args[]) {
		
		System.out.println(!true);
		System.out.println(!false);
		
		int a =4, b=5;
		
		if (a>=b) {
			System.out.println(a+">="+b);
		}
		
		if (!(a>=b)) {
			System.out.println(a+"<"+b);
		}
	}
}
