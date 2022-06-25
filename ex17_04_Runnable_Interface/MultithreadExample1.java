//Runnable 인터페이스를 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface;
public class MultithreadExample1 {
	public static void main (String [] args) {
		//Runnable 인터페이스를 구현하는 클래스의 객체를 생성해서
		//Thread 생성자의 파라미터로 사용
		SmallLetters small = new SmallLetters();
		Thread thread = new Thread(small);
		thread.start();
		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		
		for (char chr : arr)
			System.out.print(chr);
	}
}
