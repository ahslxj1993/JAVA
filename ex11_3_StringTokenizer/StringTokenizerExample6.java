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
		
		System.out.println("*** StringTokenizer : "+phone+" ��ū�и� ***");
		
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		System.out.println("*** String�� split �޼ҵ� �̿� : "+phone+" ��ū�и� ***");
		
		String[] st = phone.split("-");
		
		for (int i=0 ; i<st.length; i++) {
			System.out.println(st[i]);
		}
	}// main end

}
