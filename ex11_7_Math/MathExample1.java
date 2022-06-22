package ex11_7_Math;

public class MathExample1 {
	public static void main(String [] args) {
		
		System.out.println("12.45 반올림? "+Math.round(12.45));
		System.out.println("124.5 반올림? "+Math.round(124.5));
		
		System.out.println("12.45 소수점 한자리까지 반올림? "+Math.round(12.45*10)/10.0);
	}
}
