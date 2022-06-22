package ex07_02_constructor;

public class ConstructorHomework {
	public static void main(String[] args) {
		/*
		 * Student 강호동 = new Student("강호동",85,70,60); Student 이승기 = new
		 * Student("이승기",90,80,95); Student 유재석 = new Student("유재석",75,100,80); Student
		 * 하하 = new Student("하하",80,95,70); Student 이광수 = new Student ("이광수",100,80,65);
		 */
		Student[] students = { new Student("강호동", 85, 60, 70), new Student("이승기", 90, 80, 95),
				new Student("유재석", 75, 100, 80), new Student("하하", 80, 95, 70), new Student("이광수", 100, 80, 65) };

		System.out.println("==========학생별 / 과목별 총점 구하기 ==========\n");
		System.out.printf("\t국어\t수학\t영어\t총점\t평균\n");

		// print(강호동);print(이승기);print(유재석);print(하하);print(이광수);
		
		sort(students);
		printInfo(students);
		

		for (int j = 0; j < 45; j++)
			System.out.print("=");

		System.out.print("\n총점\t");

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
	 * 배열과 반복문까지 사용해가면서 만들고 싶었지만 너무 어렵네요 ㅠㅠ 배열과 반복문보다 오히려 클래스나 메소드 활용하는게 더 쉽다고 느껴져요
	 * 주말동안 열심히 공부해 오겠습니다~
	 */

}