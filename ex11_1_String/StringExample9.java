package ex11_1_String;

public class StringExample9 {
	public static void main(String[] args) {
		String message = "Java program creates many objects.";
		
		int index1 = message.indexOf('a');
		//지정된 문자가 최초로 위치한 인덱스를 구합니다
		//존재하지 않는경우 -1을 리턴합니다
		//문자열 앞에서부터 차례대로 검색합니다,.
		System.out.println("a의 위치는 "+ index1);
		
		int index2 = message.indexOf(97);
		//아스키코드 97은 소문자 'a'
		System.out.println("a의 위치는 "+ index2);
		
		int index23 = message.indexOf(65);
		//아스키코드 75는 대문자 'A'
		System.out.println("A의 위치는 "+index23);
		
		int index3 = message.indexOf('a',13);
		//index번호 13번째 부터 'a'를 찾습니다.
		System.out.println("13번 부터 a 의 위치는 "+index3);
		
		int index4 = message.indexOf("av");
		//"av"의 시작 index를 찾습니다.
		System.out.println("av로 시작하는 index는 "+index4);
		
		int index5 = message.indexOf("man",12);
		//index번호 12 번째부터 "man"의 시작 index를 찾습니다,
		System.out.println("12번째 위치부터 man의 위치는 "+index5);
		
		int index6 = message.indexOf("java");
		System.out.println("java의 위치는 "+index6);
}//main end
}
