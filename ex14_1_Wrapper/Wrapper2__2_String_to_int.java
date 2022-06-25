package ex14_1_Wrapper;

public class Wrapper2__2_String_to_int {
	public static void main(String args[]) {
		int total =0;
		
		//방법1
		//String -> Integer 객체
		//Integer 객체 -> int형 값
		for (int cnt =0; cnt<args.length ; cnt++) {
			System.out.println("args["+cnt+"]= "+ args[cnt]);
			
			//인자로 받은 문자열을 가지고 Integer객체를 생성합니다.
			Integer obj = Integer.valueOf(args[cnt]);
			
			//Integer 객체 안에 있는 int 값을 가져옵니다.
			total += obj.intValue();
		}
		System.out.println("합 = "+total);
		
		//방법2
		//String -> int
		int total2=0;
		for (int cnt =0 ; cnt<args.length ; cnt++) {
			total2+= Integer.parseInt(args[cnt]);
		}
		System.out.println("합 = "+total2);
	}
}
