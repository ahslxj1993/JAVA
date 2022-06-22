package ex17_07_SharedArea_solution;
//CalcThread가 계산된 파이값을 공유영역에 쓰기도전에
//PrintThread가 공유영억의 데이터를 읽어갔기 때문에
//result 필드가 가지고있던 기본값 0.0이 출력되었습니다.
//해결책은??
public class MultithreadExample4 {
	public static void main (String [] args) {
		//공유영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장합니다.
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		
		thread1.start();
		thread2.start();
		
	}
}
