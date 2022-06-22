package ex11_1_String;

public class StringExample5 {
	public static void main(String [] args) {
		String str = "오늘도 화이팅 입니다.";
		
		int len = str.length();
		
		for (int cnt =0 ; cnt < len ; cnt ++) {
			char ch = str.charAt(cnt);
			System.out.println("index = "+ cnt + "문자 ="+ch);
		}
	}
}
