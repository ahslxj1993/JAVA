package ex05;

public class Oper01_0 {
	public static void main(String args[]) {
		/*
		 * 1. ������ : ���� (���� ���� ������ ��Ģ�� ���� ����ϴ°�)�� �����ϴ� ��ȣ
		 * ��) + - *
		 * 2.�ǿ�����: ������ ���
		 * 
		 * 3.�� : �����ڿ� �ǿ����ڸ� �����Ͽ� ����ϰ��� �ϴ� �ٸ� ǥ���Ѱ�
		 * ��) x+3
		 * x�� 3 �� �ǿ�����, +�� ������
		 * 4. ���� ����Ͽ� ����� ��� ���� ���� ��(evaluation)�Ѵٰ� �մϴ�.
		 * */
		
		int a=10, b=4, c;
		
		c= a+b; //c=14
		System.out.println(a+"+"+b+"="+c);
		
		c=a-b; //c=6
		System.out.println(a+"-"+b+"="+c);
		
		c=a*b; //c=40
		System.out.println(a+"*"+b+"="+c);
		
		c=a/b; //c=2
		System.out.println(a+"/"+b+"="+c);
		
		c=a%b; //c=2(�������� ������)
		System.out.println(a+"%"+b+"="+c);
		System.out.printf("%d %% %d = %d %n%n%n",a,b,c);
		
		
		// a/b = 2.5�� �����ô�.
		System.out.println("(double)(a/b)="+ (double) (a/b));
		System.out.println("(double)a =" + (double) a);
		System.out.println("(double)a/b = "+ (double)a/b);
		System.out.println("a/ (double)b = "+ a/ (double)b);
		System.out.println("(double)a / (double b)= "+ (double)a / (double) b);
		double c1 = (double) a/b;
		System.out.println(a+"/"+b+"="+c1);
		
	}
}
