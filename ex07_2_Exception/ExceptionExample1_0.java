package ex07_2_Exception;

public class ExceptionExample1_0 {
	public static void main (String arsg[]) {
		int sum = 1+2;
		try{
			if (sum<0) {
			throw new Exception("�����߻�");
		}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]"+e.getMessage());
		}
	}
}
