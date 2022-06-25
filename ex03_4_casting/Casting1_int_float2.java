package ex03_4_casting;

public class Casting1_int_float2 {
	public static void main(String[] args) {
		
		double d2=10.12345;
		
		//2. 명시적 형변환
		// 에러발생 - Type mismatch: cannot convert form double to int
		//int i2 = d2;//정수형 변수(4byte)에 실수형 값(8byte)을 저장할수 없습니다. 
		
		int i2= (int) d2;
		
		System.out.println("i2의 값은"+i2+"입니다.");
	}
}