package ex06_01_array;

public class two_array_for_example_string {
	public static void main(String args[]) {
		String arr[][] = { { "����", "���" }, { "���̽�ũ��", "�޷γ�" }, { "Ŀ��" } };
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
	System.out.println("��");
	}

}
