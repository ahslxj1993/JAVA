package ex04_12_conditonal_op;

import java.io.InputStream;
import java.util.Scanner;

public class ����_1 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		int n1,n2,n3,max,min;
		
		System.out.println("3���� ������ �Է��ϼ���.");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		sc.close();
		
		max= (n1>n2)?n1:n2;
		max=(max>n3)? max:n3;
		
		min=(n1<n2)?n1:n2;
		min=(min<n3)?min:n3;
		
		System.out.println("max="+max);
		System.out.println(n1+","+","+n2+","+n3+" �� ���� ū���� "+max+" �Դϴ�/");
		
		System.out.println("min="+min);
		System.out.println(n1+","+n2+","+","+n3+" �� ���� ���� ���� "+min+" �Դϴ�/");
		
		if (n1<n2) {
			min=n1<n3?n1:n3;
			System.out.println(min);
		}
		

		
		
		

	}
}
