package ex03_4_casting;

public class Casting1_int_float {
	public static void main(String[] args) {
		
		int i1 = 10;
		
		//1.자동 형변환, 묵지적 형변환, 암시적 형변환
		//자동 형변환은 변수에 값을 저장하거나 메서드의 인자값이 매개변수로 전될될때
		//일치하지 않은 자료형인 경우 컴파일러가 자동으로 형변환을 해주는 것입니다.
		//double d1 = (double)i1;
		
		double d1=i1;//실수형 변수에 정수형 값을 저장할수 있습니다.
		System.out.println("d1 데이터는 "+d1+"입니다.");
	}
}
