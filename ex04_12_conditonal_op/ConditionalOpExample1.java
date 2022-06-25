package ex04_12_conditonal_op;

public class ConditionalOpExample1 {
public static void main(String args[]) {
	int a = 20, b =30,max,min;
	
	 System.out.println(a>b? a:b);
	
	max = a>b? a: b;
	
	System.out.println("ÃÖ´ñ°ª = "+ max);
	
	
	System.out.println(a>b?b:a);
	
	min = a>b?b:a;
	System.out.println("ÃÖ¼Ú°ª = "+min);
}
}
