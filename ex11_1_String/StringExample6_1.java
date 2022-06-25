package ex11_1_String;

public class StringExample6_1 {
	public static void main(String [] args) {
		String jumin = "123456-3123456";
		
		String s = jumin.substring(7,8);
		System.out.print("추출한 숫자는 "+s+"이고");
		
		if (s.equals("1") || s.equals("3")) {
			System.out.print(" 남자입니다.");
		}  else if (s.equals("2") || s.equals("4")) {
			System.out.println(" 여자입니다.");
		}else {
			System.out.println(" 외국인 입니다.");
		}
		
	}
}
