package ex07_2_Exception;

public class ExceptionExample2_4 {
	public static void main (String [] args) {
		int num1 = 3, num2 =1;
		
		try{
			int result = num1/num2;
			System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("여기까지");
			}
	}
}
