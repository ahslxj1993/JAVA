package ex06_02_method;

public class MethodExample4 {
	public static void main (String [] args) {
		System.out.println(concatenate(", ","���","��"));
		System.out.println(concatenate(", ","���","��","���"));
		System.out.println(concatenate(", ","���","��","���","Ű��"));
		System.out.println(concatenate(", ",new String[] {"���","��","���","Ű��"})); // �迭�� �����մϴ�
	}
	
	public static String concatenate (String delim, String ...str) {
		String result = "";
		
		for(String imsi:str)
			result+=imsi+delim; // ��) ���,��,

		return result;
	} 
}
