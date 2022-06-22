package ex06_01_array;

public class two_array_example1 {
	public static void main(String args[]) {
		int table[][] = new int[3][4];
		table [0][0] = 10;
		table [1][1] = 20;

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println("table ["+i+"] ["+j+ "] = " +table[i][j]);
			}
		}
	}
}
