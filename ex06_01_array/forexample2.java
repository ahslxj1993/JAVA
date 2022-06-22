package ex06_01_array;

public class forexample2 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, };
		String fam[] = {"최시준","최시철","최우영"};

		for (int num : arr) {
			System.out.println(num);
		}
		for (String az :fam) {
			System.out.println(az);
		}
		System.out.println("End");
	}
}
