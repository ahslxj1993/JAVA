package ex11_1_String;

public class StringExample4 {
	public static void main (String args[]) {
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		
		if (str1.equals(str2))
			System.out.println("str1.equals(str2) 같음");
		else
			System.out.println("str1.equals(str2) 다름");
	}
}
