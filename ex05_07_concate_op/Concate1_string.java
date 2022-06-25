package ex05_07_concate_op;

public class Concate1_string {
	public static void main(String[] args) {
		String a ="퇴실";
		String b = " 꼭 찍어주세요";
		String c = a + b;
		
		System.out.println(c);
		
		String str="결과값 : ";
		
		int n = 10;
		
		System.out.println(str+n);
		String str1 = "hap="+3+4;
		
		str1 = "" +3+4;
		System.out.println(str1);
	}
}
