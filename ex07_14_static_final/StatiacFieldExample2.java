package ex07_14_static_final;

public class StatiacFieldExample2 {
	public static void main(String args[]) {
		System.out.println("상한값 = "+LimitedValue.UPPER_LIMMIT);
		
		LimitedValue v = new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value = "+v.value);
		
		System.out.println("정수의 상한값 = "+Integer.MAX_VALUE);
		System.out.println("정수의 하한값 = "+Integer.MIN_VALUE);
	}
}
