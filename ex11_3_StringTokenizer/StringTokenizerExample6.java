package ex11_3_StringTokenizer;

import java.util.*;
/*
 * 
 * 
 *
 */
public class StringTokenizerExample6 {
	public static void main(String args[]) {
		String phone = "010-1234-5678"; 
		
		StringTokenizer str = new StringTokenizer(phone,"-");
		
		System.out.println("*** StringTokenizer : "+phone+" 토큰분리 ***");
		
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		System.out.println("*** String의 split 메소드 이용 : "+phone+" 토큰분리 ***");
		
		String[] st = phone.split("-");
		
		for (int i=0 ; i<st.length; i++) {
			System.out.println(st[i]);
		}
	}// main end

}
