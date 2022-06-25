package ex07_02_constructor;

public class ConstructorHomework {
	public static void main(String[] args) {
		/*
		 * Student ��ȣ�� = new Student("��ȣ��",85,70,60); Student �̽±� = new
		 * Student("�̽±�",90,80,95); Student ���缮 = new Student("���缮",75,100,80); Student
		 * ���� = new Student("����",80,95,70); Student �̱��� = new Student ("�̱���",100,80,65);
		 */
		Student[] students = { new Student("��ȣ��", 85, 60, 70), new Student("�̽±�", 90, 80, 95),
				new Student("���缮", 75, 100, 80), new Student("����", 80, 95, 70), new Student("�̱���", 100, 80, 65) };

		System.out.println("==========�л��� / ���� ���� ���ϱ� ==========\n");
		System.out.printf("\t����\t����\t����\t����\t���\n");

		// print(��ȣ��);print(�̽±�);print(���缮);print(����);print(�̱���);
		
		sort(students);
		printInfo(students);
		

		for (int j = 0; j < 45; j++)
			System.out.print("=");

		System.out.print("\n����\t");

		printTotal(students);

	}

	private static void sort(Student[] students) {
		Student imsi;
		for (int i =0 ; i<students.length-1; i++) {
			for (int j =i+1 ; j<students.length ; j++) {
				if (students[i].getTotal()>students[j].getTotal() ){
					imsi = students[i];
					students[i] = students[j];
					students[j] = imsi;}
			}
		}
		
	}

	private static void printTotal(Student[] students) {

		int total[] = new int[3];
		total[0] = students[0].kor + students[1].kor + students[2].kor + students[3].kor + students[4].kor;
		total[1] = students[0].math + students[1].math + students[2].math + students[3].math + students[4].math;
		total[2] = students[0].eng + students[1].eng + students[2].eng + students[3].eng + students[4].eng;

		System.out.print(total[0] + "\t");
		System.out.print(total[1] + "\t");
		System.out.print(total[2] + "\t");

	}

	private static void printInfo(Student[] objs) {

		for (Student obj : objs) {
			System.out
					.print(obj.name + "\t" + obj.kor + "\t" + obj.math + "\t" + obj.eng + "\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
		}

	}

	public static void print(Student names) {
		System.out.print(names.name + "\t");
		System.out.print(names.kor + "\t");
		System.out.print(names.math + "\t");
		System.out.print(names.eng + "\t");
		System.out.print(names.getTotal() + "\t");
		System.out.printf("%.1f\n", names.getAverage());

	}
	/*
	 * �迭�� �ݺ������� ����ذ��鼭 ����� �;����� �ʹ� ��Ƴ׿� �Ф� �迭�� �ݺ������� ������ Ŭ������ �޼ҵ� Ȱ���ϴ°� �� ���ٰ� ��������
	 * �ָ����� ������ ������ ���ڽ��ϴ�~
	 */

}