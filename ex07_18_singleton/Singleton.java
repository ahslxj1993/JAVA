package ex07_18_singleton;
//싱글톤
public class Singleton {
	//필드 s 는 외부에서 사용못합니다
	//이 문장은 처음 싱글톤 클래스가 JVM에 로딩될때 한번만 실행됩니다
	private static Singleton s = new Singleton();
	
	//private : 외부에서 생성자를 회출할수 없도록 막습니다.
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("여기는 싱글톤입니다.");
		return s;
	}
}