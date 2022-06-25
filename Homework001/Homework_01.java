package Homework001;

public class Homework_01 {
	public static void main(String args[]) {
		String jumin = new String("123456-a234567");

		
		if (check_length(jumin)==true) {//-가 들어있는 14자리인지?
			
			if (check_hyphen(jumin) == true) { // -가 있는지?
				int isNumber = isNumber(jumin);
				 
				if (isNumber>=0 && isNumber<=5){//앞자리가 숫자가 아닐때
					System.out.println("주민번호 앞자리를 숫자로 입력하세요");
				}
				
				else if(isNumber>=7 && isNumber<=13) {//뒷자리가 숫자가 아닐때
					System.out.println("주민번호 뒷자리를 숫자로 입력하세요");
				} 
				
				else if (isNumber == -1)  {//모두 아닐때 pandan_gender 실행
					System.out.println(pandan_gender(jumin)+"입니다.");
				}
				
			} else {
				System.out.println("-을 넣어주세요.");
			} // if else check_hyphen
		} else {
			System.out.println("주민번호는 14자리 입니다.");
		} // if else check_length

	}// main method

	static boolean check_length(String jumin) {
		return jumin.length() ==14;	
	}// check_length

	static String pandan_gender(String jumin) {
		String gender = jumin.substring(7, 8);
		String result = "외국인";
		if (gender.equals("1") || gender.equals("3")) {
			result = "남자";
		} else if (gender.equals("2") || gender.equals("4")) {
			result = "여자";
		}
		return result;
	}// pandan_gender

	static boolean check_hyphen(String jumin) {
		return jumin.substring(6, 7).equals("-");
	}// check_hyphen

	static int isNumber(String jumin) {
		/*String jumin_without_hyphen = jumin.replace("-", "");// jumin에서 하이픈을 제외한 문자열 jumin_without_hyphen
		for (int i = 0; i < jumin_without_hyphen.length();i++) {//인덱스 값을 가지기 위한 반복문(i)
			char number = jumin_without_hyphen.charAt(i);// jumin_without_hyphen을 한글자 한글자 뽑아내기 위해 charAt(i)생성하고 캐릭터 변수
														// number에 넣기
			if (!('0'<=number && number<='9')) {
				return  i; // number가 0과 9 사이가 아니면 그 인덱스 값인 i를 리턴
			}
		}
		return -1;*/
		
		int index = -1;
		int len = jumin.length();
		
		for (int i = 0 ; i < len; i ++) {
			
			char test = jumin.charAt(i);
			
			if (test=='6')
					continue;
			
			
			if (!('0'<=test && test<='9')) {
				index = i;
				break;
			}
		}
		return index;
	}// isNumber

}
