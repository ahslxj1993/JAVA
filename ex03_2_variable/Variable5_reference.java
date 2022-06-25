package ex03_2_variable;

public class Variable5_reference {
	public static void main(String[] args) {
		//참조형-s1,s2는 메모리주소, new는 연산자,
		//new String("자바"); 에서 String("자바")는 생성자
		String s1 = "자바";
		
		
		//객체생성
		//클래스	참조형변수	= 연산자	생성자 호출
		String	s2		= new	String("자바");//String은 라이브러리로 제공되는 클래스
		
		System.out.println("s1="+s1+" s2= "+s2);
	}
}
