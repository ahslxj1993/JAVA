/*기존 사각형 클래스에 메소드를 추가한 경우
 * 에러발생 : 직렬화 할때 사용한 클래스와
 * 역직렬화 할때 사용한 클래스의 버전이 다르기 때문
 * */

package ex19_07_serialVersionUID;

public class Rectangle implements java.io.Serializable{

	private static final long serialVersionUID = -8293824171898762620L;
	private int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "가로 : "+width+
				"\n높이 : "+height;
	}
	
	/*실행방법
	 * 
	 * 1.아래 getArea 메소드의 주석을 달고 실행한 경우에는 에러 없음
	 * ObjectOutputExample.java를 실행
	 * ObjectInputExample.java 실행
	 * 
	 * 2. 아래 메소드의 주석을 푼후 - 에러발생
	 * ObjectInputExample.java 실행
	 * 
	 * serialVersionUID는 같은 클래스임을 알려주는 식별자 역할을 하며
	 * Serializable 인터페이스를 구현한 클래스를 컴파일하면 자동적으로
	 * serialVersionUID 정적 필드가 추가됩니다.
	 * 
	 * serialVersionUID는 자바의 직렬화 매커니즘과 역직렬화 매커니즘이 실행될 때
	 * 자동으로 부여되는데 직렬화 가능 클래스의 내용이 그대로이면 같은 번호가 부여되고
	 * 클래스의 구성요소가 하나라도 바뀌면 완전히 다른 serialVersionUID가 부여됩니다.
	 * 
	 * 하지만 명시적으로 클래스에 serialVersionUID가 선언되어 있으면
	 * 컴파일시 추가되지 않기 때문에 동일한 값을 유지할수 있습니다.
	 * */
	
	
	/*
	int getArea() {
		return width * height;
	}
	*/
	
	
}
