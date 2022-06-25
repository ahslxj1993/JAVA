package ex11_1_String;

public class StringExample6_3 {
	public static void main(String [] args) {
		String jumin = "123456-4123456";
		
		if(check_length(jumin)) {
			System.out.println(pandan_gender(jumin)+" 입니다.");
		}else {
			System.out.println("주민등록 번호는 14자리 이어야 합니다.");
		}

		}//main
	
	public static Boolean check_length(String jumin) {
		return jumin.length() !=14 ? false:true;
		}//check_length
	
	static String pandan_gender(String jumin) {
		String gender = jumin.substring(7,8);
		String result = "외국인";
		switch (gender){
			case "1":
			case "3":
				result = "남자";
				break;
			case "2":
			case "4":
				result = "여자";
				break;
		}
		return result;
		
	}//pandan_gender
}
