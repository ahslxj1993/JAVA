package ex13_8_clone_2;
/*
 * 복제 가능한 클래스 만들기
 * 1단계 Cloneable 인터페이스 구현
 * 2단계 clone() 메소드 오버라이드 하기
 * */

//Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미입니다.
public class Rectangle implements Cloneable {
	int width, height;
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Object 클래스에 정의된 clone()
	 * protected Object clone() throws CloneNotSupportedException;
	 * ==> 오버라이딩시 접근 제어자 변경
	 * (protected => public : 상속관계 없이 다른 클래스에서 호출 할 수 있씁니다.)
	 */
	
	/*
	 * 공변 변환 타입(covariant return type) - JDK1.5 부터 적용
	 * 오버라이딩 할때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 
	 * 허용하는 것입니다
	 * 
	 * 즉, 반환형을 Object 에서 자손 클래스 타입으로 변경을 허용합니다.
	 * 
	 * 좋은점: clone()호출 후 형 변환이 필요없습니다(메인 메서드)
	 * Rectangle obj2 = (Rectangle) obj1. clone();
	 * ==> Rectangle obj2 = obj1.clone();
	 * */
	
	public Rectangle clone() {//변경된 곳 : Object형 -> Rectangle 형으로 변경
		try {
			//슈퍼 클래스의 clone메서드를 호출해서 그 결과를 리턴
			return (Rectangle) super.clone(); // 변경된곳 : Rectangle 형으로 변환합니다.
		}
		//슈퍼 클래스의 clone메서드가 발생하는 익셉션을 처리
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	/*
	public Object clone() {//반환형이 Object 형입니다.
		try {
			//슈퍼 클래스의 clone메서드를 호출해서 그 결과를 리턴
			return super.clone();
		}
		//슈퍼 클래스의 clone메서드가 발생하는 익셉션을 처리
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	*/
	
	public String toString() {
		return "가로는 "+width+", 세로는 "+height;
	}
	
	public boolean equals(Object obj) {
		if ( obj !=null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return this.width == r.width &&
					this.height == r.height; 
		}
		else
			return false;
	}
}
