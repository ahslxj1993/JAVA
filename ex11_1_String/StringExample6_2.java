package ex11_1_String;

public class StringExample6_2 {
	public static void main(String [] args) {
		String jumin = "123456-3123456";
		
		String s = jumin.substring(7,8);
		System.out.print("������ ���ڴ� "+s+"�̰�");
		

		
		switch (s){
		case "1":
		case "3": System.out.print(" �����Դϴ�."); break;
		case "2":
		case "4": System.out.print(" �����Դϴ�."); break;
		
		default:
			System.out.println(" �ܱ��� �Դϴ�.");
		}
	}
}
