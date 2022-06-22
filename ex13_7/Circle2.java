package ex13_7;

public class Circle2 {
	int radius;

	Circle2(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "radius = " + radius;
	}
	
	public boolean equals(Object obj) {
		/*
		 * obj가 null이 아니고 obj를 Circle2로 형변환이 가능한지 체크합니다.
		 * 조건을 만족하면 obj를 Circle2로 형변환하고
		 * 형변환한 obj의 radius값과 현재 객체의 radius값을 비교해서 같으면
		 * true를 아니면 false를 리턴합니다.
		 * 
		 * 위 조건을 만족하지 않으면 false를 리턴합니다.
		 */
		
		if ( obj !=null && obj instanceof Circle2) {
			Circle2 obj2 = (Circle2) obj;
			return this.radius == obj2.radius;
		}
		else
			return false;
	}
}
