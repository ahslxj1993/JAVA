package ex14_1_Wrapper;

public class Wrapper2__1_String_to_int {
	public static void main(String args[]) {
		int total =0;
		for (int cnt =0 ; cnt<args.length ; cnt++) {
			//에러발생(String -> int 형변환 요구)
			total = args[cnt]+total;
		}
		
		System.out.println(total);
	}
}
