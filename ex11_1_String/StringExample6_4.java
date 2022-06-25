package ex11_1_String;

public class StringExample6_4 {
	public static void main(String [] args) {
		String jumin = "123456-3123456";
		
		char s = jumin.charAt(7);
		System.out.print("추출한 숫자는 "+s+"이고");
		

		
		switch (s){
		case '1':
		case '3': System.out.print(" 남자입니다."); break;
		case '2':
		case '4': System.out.print(" 여자입니다."); break;
		
		default:
			System.out.println(" 외국인 입니다.");
		}
	}
}
