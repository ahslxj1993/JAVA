package ex11_1_String;

public class StringExample5 {
	public static void main(String [] args) {
		String str = "���õ� ȭ���� �Դϴ�.";
		
		int len = str.length();
		
		for (int cnt =0 ; cnt < len ; cnt ++) {
			char ch = str.charAt(cnt);
			System.out.println("index = "+ cnt + "���� ="+ch);
		}
	}
}
