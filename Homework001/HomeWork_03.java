package Homework001;


public class HomeWork_03 {
	public static void main(String[] args) {
		int count = 6; // ���� ���� ����
		int a[] = new int[count];

		for (int i = 0; i < count; i++) {
			a[i] = (int)(45*Math.random()+1); // 1 ~ 45������ ����
			for (int j = 0; j < i; j++) { 
				if (a[i] == a[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println("���� " + (i + 1) + " : " + a[i]);
		}
	}
}
