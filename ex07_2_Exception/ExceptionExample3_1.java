package ex07_2_Exception;

public class ExceptionExample3_1 {
	public static void main (String [] args) {
		int result;
		try {
			result = add(1,-2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//throws Exception : throw에 의해 발생한 에러를 호출한 메서드로 넘깁니다.
	static int add (int a, int b) throws Exception {
		int result = a+b;
		if (result <0)
			throw new Exception("0보다 작아서 에러가 발생합니다");
		System.out.println("이 부분은 출력이 될까?");
		return result;
	}
}
