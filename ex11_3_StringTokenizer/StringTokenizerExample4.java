package ex11_3_StringTokenizer;

import java.util.StringTokenizer;
//StringTokenizer를 이용해서 문자열로부터 토큰을 분리하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.
public class StringTokenizerExample4 {
	public static void main(String args[]) {
		//true : 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok
		= new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true);
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}//main end
	
}
