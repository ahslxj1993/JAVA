package ex09_02_null;
//obj 변수에 null이라는 참조값이 있기때문에 컴파일 에러는 없지만
//실행시 에러 발생(런타임 에러 발생)
public class RefTypeExample4 {
	public static void main(String [] args) {
		Point obj = null;
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
