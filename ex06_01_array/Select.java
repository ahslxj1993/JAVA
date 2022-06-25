//선택 정렬 - 최소 선택 정렬(오름차순)
//선택된 데이터에 비교 데이터들 중 가장 작은 값을 구한다.
package ex06_01_array;

public class Select {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("\n" + "a[" + i + "]번째 데이터 선택, a[j]번째와 비교(a[" + i + "]>a[j])이면 두 수를 바꾼다.");
			System.out.printf("\t\t\t%s", "원본 데이터: ");
			for (int k = 0; k < a.length; k++)
				System.out.printf("%3d", a[k]);

			System.out.println();
			for (int j = i + 1; j < a.length; j++) {
				System.out.print("i=" + i + "\t" + "j=" + j + "\t" + "a[" + i + "]=" + a[i] + " > a[" + j + "]="
						+ a[j] + "\t[");
				if (a[i] > a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				} // if
				for (int k = 0; k < a.length; k++)
					System.out.printf("%3d", a[k]);
				System.out.println("  ]");
			} // for j
			
			for(int k=0;k<60;k++)
			  System.out.print("=");
		} // for i
	}

}