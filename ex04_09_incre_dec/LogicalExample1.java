package ex04_09_incre_dec;

public class LogicalExample1 {
	public static void main(String[] args) {
		boolean a=9>3;
		boolean b=5>7;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		//&&�� �ΰ� ��� (and) ||�� �����ϳ� (or)
		
		if (a&&b) {
			System.out.println("a&&b�� ��");
		}
		
		if (a||b) {
			System.out.println("a||b�� ��");
		}
	}
}
