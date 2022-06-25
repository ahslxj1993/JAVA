package ex11_3_StringTokenizer;

import java.util.StringTokenizer;
//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.
public class StringTokenizerExample3 {
	public static void main(String args[]) {
		//구분자 - 콤마(,)와 수직선(|)
		StringTokenizer stok
		= new StringTokenizer("사과,배|복숭아",",|");
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}//main end
	
}
