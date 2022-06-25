package ex06_02_method;

public class MethodExample4 {
	public static void main (String [] args) {
		System.out.println(concatenate(", ","사과","배"));
		System.out.println(concatenate(", ","사과","배","멜론"));
		System.out.println(concatenate(", ","사과","배","멜론","키위"));
		System.out.println(concatenate(", ",new String[] {"사과","배","멜론","키위"})); // 배열도 가능합니다
	}
	
	public static String concatenate (String delim, String ...str) {
		String result = "";
		
		for(String imsi:str)
			result+=imsi+delim; // 예) 사과,배,

		return result;
	} 
}
