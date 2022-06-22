package ex06_01_array;

public class two_array_for_example_string {
	public static void main(String args[]) {
		String arr[][] = { { "과일", "사과" }, { "아이스크림", "메로나" }, { "커피" } };
		for (String n : arr[0]) {
			System.out.println(n);
		}
		System.out.println("===========================");

		for (String[] i : arr) {
			for (String n : i) {
				System.out.printf("%s\t", n);
				System.out.println("");
			}
			
			
		}
	System.out.println("끝");
	}

}
