package ex04_09_incre_dec;

public class EqulityExample2 {
	public static void main(String args[]) {
		String s1 = "자바";
		
		String s2 = new String("자바");
		
		System.out.println("s1= "+s1+" s2= "+s2);
		
		//주소값이 같은지 비교
		if (s1==s2) {
			System.out.println("같은 주소");
		}	else {
			System.out.println("다른 주소");
		}
		
		//내용값이 같은지 비교
		if (s1.equals(s2)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		
		
	}
}
