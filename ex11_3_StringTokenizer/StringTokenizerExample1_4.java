package ex11_3_StringTokenizer;

import java.util.StringTokenizer;
//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.
public class StringTokenizerExample1_4 {
	public static void main(String args[]) {
		StringTokenizer stok
		= new StringTokenizer("사과 배 복숭아");
		
		while(stok.hasMoreTokens()) {
			System.out.println(stok.nextToken());
		}
	}//main end
	
}
