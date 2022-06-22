package ex03_2_variable;

public class Varaible3_char {
	public static void main(String[] args) {
		
		System.out.println("=============문자형 변수================");
		
		char c1 ='A';
		char c2='@';
		char c3='가';
		
		System.out.println("c1="+c1+" c2="+c2+" c3="+c3);
		
		char c4=65; // 영문'A'를 의미
		char c5='\uAC00';//한글 유니코드'가'를 의미
		
		System.out.println("c4="+c4+" c5="+c5);
	}
}
