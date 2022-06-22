package ex11_1_String;

public class StringExample7 {
	public static void main(String[] args) {
		String str1 = "     I Like Java";
		String str2 = str1.trim();
		
		System.out.println("===== trim() : 문자열 앞뒤 공백 제거 ======");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("문자열 길이 = "+str2.length()+"\n");
		
		System.out.println("==== concat() : 문자열 연결 ====");
		System.out.println(str2.concat("     날씨가 좋아요"));
		System.out.println(str2+"\n");
		
		System.out.println("==== toUpperCase() : 대문자로 변환 ====");
		System.out.println(str2.toUpperCase());
		System.out.println(str2+"\n");
		
		System.out.println("==== toLowerCase() : 소문자로 변환 ====");
		System.out.println(str2.toLowerCase());
		System.out.println(str2+"\n");
		
		System.out.println("==== replace () : 새로운 글자로 모두 변경 ====");
		System.out.println(str2.replace('J','j'));
		System.out.println(str2+"\n");
		
		System.out.println("=================toString()==============");
		System.out.println(str1.toString());
		System.out.println(str2.toString()+"\n");
	}//main end
}
