package ex05_07_concate_op;

public class Concate2_hap {
	public static void main(String [] args) {
		String str1 = "hap="+3+4;
		System.out.println(str1);
		
		String str2 = 3+4+"=hap";
		System.out.println(str2);
		
		String str3= "hap="+(3+4);
		System.out.println(str3);
		
		str1 = ""+3+4;
		System.out.println(str1);
		
		str1=3+4+"";
		System.out.println(str1);
		
		str1 =3 +4+""+"¿‘¥œ¥Ÿ.";
		System.out.println(str1);
	}
}
