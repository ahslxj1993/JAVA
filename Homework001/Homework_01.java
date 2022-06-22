package Homework001;

public class Homework_01 {
	public static void main(String args[]) {
		String jumin = new String("123456-a234567");

		
		if (check_length(jumin)==true) {//-�� ����ִ� 14�ڸ�����?
			
			if (check_hyphen(jumin) == true) { // -�� �ִ���?
				int isNumber = isNumber(jumin);
				 
				if (isNumber>=0 && isNumber<=5){//���ڸ��� ���ڰ� �ƴҶ�
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}
				
				else if(isNumber>=7 && isNumber<=13) {//���ڸ��� ���ڰ� �ƴҶ�
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				} 
				
				else if (isNumber == -1)  {//��� �ƴҶ� pandan_gender ����
					System.out.println(pandan_gender(jumin)+"�Դϴ�.");
				}
				
			} else {
				System.out.println("-�� �־��ּ���.");
			} // if else check_hyphen
		} else {
			System.out.println("�ֹι�ȣ�� 14�ڸ� �Դϴ�.");
		} // if else check_length

	}// main method

	static boolean check_length(String jumin) {
		return jumin.length() ==14;	
	}// check_length

	static String pandan_gender(String jumin) {
		String gender = jumin.substring(7, 8);
		String result = "�ܱ���";
		if (gender.equals("1") || gender.equals("3")) {
			result = "����";
		} else if (gender.equals("2") || gender.equals("4")) {
			result = "����";
		}
		return result;
	}// pandan_gender

	static boolean check_hyphen(String jumin) {
		return jumin.substring(6, 7).equals("-");
	}// check_hyphen

	static int isNumber(String jumin) {
		/*String jumin_without_hyphen = jumin.replace("-", "");// jumin���� �������� ������ ���ڿ� jumin_without_hyphen
		for (int i = 0; i < jumin_without_hyphen.length();i++) {//�ε��� ���� ������ ���� �ݺ���(i)
			char number = jumin_without_hyphen.charAt(i);// jumin_without_hyphen�� �ѱ��� �ѱ��� �̾Ƴ��� ���� charAt(i)�����ϰ� ĳ���� ����
														// number�� �ֱ�
			if (!('0'<=number && number<='9')) {
				return  i; // number�� 0�� 9 ���̰� �ƴϸ� �� �ε��� ���� i�� ����
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
