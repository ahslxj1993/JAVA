package ex11_1_String;

public class StringExample6_3 {
	public static void main(String [] args) {
		String jumin = "123456-4123456";
		
		if(check_length(jumin)) {
			System.out.println(pandan_gender(jumin)+" �Դϴ�.");
		}else {
			System.out.println("�ֹε�� ��ȣ�� 14�ڸ� �̾�� �մϴ�.");
		}

		}//main
	
	public static Boolean check_length(String jumin) {
		return jumin.length() !=14 ? false:true;
		}//check_length
	
	static String pandan_gender(String jumin) {
		String gender = jumin.substring(7,8);
		String result = "�ܱ���";
		switch (gender){
			case "1":
			case "3":
				result = "����";
				break;
			case "2":
			case "4":
				result = "����";
				break;
		}
		return result;
		
	}//pandan_gender
}
