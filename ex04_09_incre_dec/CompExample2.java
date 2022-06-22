package ex04_09_incre_dec;

public class CompExample2 {
	public static void main(String args[]) {
		
		int a= 10, b=5;
		boolean test;
		
		test = a>b;
		System.out.println(a+">"+b+"="+test);
		
		test = a<b;
		System.out.println(a+"<"+b+"="+test);
		
		System.out.println(a+b > a-b);
	}
}
