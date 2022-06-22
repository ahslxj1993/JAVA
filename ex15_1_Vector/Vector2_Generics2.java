package ex15_1_Vector;
/*
 * Vector 클래스 - ArrayList의 구버전
 * 				 ArrayList와 거의 비슷, 둘중에서 ArrayList를 더 많이 사용
 * 1.여러가지 자료형의 DATA를 모두 저장할수 있습니다
 * 2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
 * 3.중복된 데이터를 저장할수 있습니다.,
 * 4.입출력 방법이 다양합니다(열거형으로 출력가능)
 * 5. 무조건 동기화를 하기 대문에 단일 스레드 처리에서는
 * ArrayList 나 LinkedList보다 성능이 떨어집니다.
 * 
 *  참고) 동기화란 스레드에서 공유자원에 작업을 마치기 전가지는
 *  	 다른 스레드에서 공유자원에 접근하지 못하게 약속하는것
 * */
import java.util.Vector;

public class Vector2_Generics2 {
	public static void main (String [] args) {
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		print(vec);
		
		vec.add(2,"kiwi");
		print(vec);
		
		vec.set(0, "orange");
		print(vec);
		
		vec.remove("kiwi");
		print(vec);
	}
	
	private static void print(Vector vec) {
		for (int i =0; i<vec.size();i++) {
			String str = (String) vec.get(i);
			System.out.println(str);
		}
		System.out.println("====================================");
	}
}
