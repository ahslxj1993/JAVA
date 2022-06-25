package ex12_1_Exception;
/*
 * */
public class ExceptionExample2_4 {
	public static void main (String [] args) {
		int num1 =3 ,num2 =0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
		} finally {
			System.out.println("finally 까지 나왔음.");
		}
	}
}
