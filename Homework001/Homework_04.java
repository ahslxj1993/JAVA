package Homework001;

public class Homework_04 {
	public static void main(String args[]) {

		Student2[] students = { 
				   new Student2("강호동", 85, 60, 70),
	               new Student2("이승기", 90, 95, 80), 
	               new Student2("유재석", 75, 80, 100), 
	               new Student2("하하", 80, 70, 95), 
	               new Student2("이광수", 100, 65, 80) };
		
		printStudent(students);
		

	}


	static void printStudent(Student2[] objs) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student2 obj : objs) {
			System.out.println((obj.toString()));
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal+"\t"
		                  +Student2.engTotal+"\t"
				          +Student2.mathTotal);		
	}
}
