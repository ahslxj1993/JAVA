package ex06_02_method;

public class MethodQuestion05 {
	public static void main(String args[]) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };
		int[][] score = { { 85, 60, 70 }, // 0�� ��ȣ��
				{ 90, 95, 80 }, // 1�� �̽±�
				{ 75, 80, 100 }, // 2�� ���缮
				{ 80, 70, 95 }, // 3�� ����
				{ 100, 65, 80 }// 4�� �̱���
		};

		int[] subject = new int[3];
		int[] student = new int[5];

		cal(subject, student, score);
		// print(sub_name, name, score, student, subject);

		System.out.println("\n\n\n");

		sort(name, score, student);
		print(sub_name, name, score, student, subject);
	}// main()_ end

	public static void print(String[] sub_name, String[] name, int[][] score, int[] student, int[] subject) {
		System.out.print("==========�л��� / ���� �������ϱ�==========\n");

		System.out.print("\n\t");
		for (int c = 0; c < 3; c++)
			System.out.print(sub_name[c] + "\t"); // ���� ���� ����

		System.out.println("����\t���");

		for (int r = 0; r < 5; r++) { // r=1
			System.out.print("\n" + name[r] + "\t"); // ��ȣ�� �̽±�
			// ������� ����� �л����� �̸� �������

			// �л����� ���� ������ �װ͵��� ������ ���
			for (int c = 0; c < 3; c++) { // c=0 c=1
				System.out.print(score[r][c] + "\t"); // 85 90
				student[r] += score[r][c]; // student[1]=90 student[1]=90+95... (����)
				subject[c] += score[r][c]; // subject[0]=85+90 subject[1]=60+95... (���)
			}
			System.out.print(student[r]/2 + "\t" + (student[r]/2) / 3);
			// ����� �Ǽ������� ���������
			// System.out.printf("%d\t%.1f",student[r], student[r]/3.0);

		}
		
	}

	public static void sort(String[] name, int[][] score, int[] student) {
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (student[i] > student[j]) {
					int imsi = student[i];
					student[i] = student[j];
					student[j] = imsi;

					int imsi2[] = score[i];
					score[i] = score[j];
					score[j] = imsi2;

					String imsi3 = name[i];
					name[i] = name[j];
					name[j] = imsi3;
				} // if
			} // for j
		} // for i
		
	}

	public static void cal(int[] subject, int[] student, int[][] score) {
		for (int r = 0; r < 5; r++) { // r=1

			for (int c = 0; c < 3; c++) { // c=0 c=1
				student[r] += score[r][c]; // student[1]=90 student[1]=90+95... (����)
				subject[c] += score[r][c]; // subject[0]=85+90 subject[1]=60+95... (���)
			}

		}

	}
}// class end
