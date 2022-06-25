package ex17_01_Thread;



public class MultithreadExample1 {
	public static void main (String [] args) {
			Thread thread = new DigitThread();//쓰레드 생성
	//쓰레드 실행
	thread.start();
	
	/*-start() 설명:
	 * 	Causes this thread to begin execution;
	 * the Java Virtual Machine calls the run method of this thread.
	 * 
	 * this thread(Thread thread = new DigitThread()의 thread)가 실행을 시작하도록 합니다.
	 * Java 가상 머신이 스레드의 run()메소드를 호출합니다.
	 * -start()를 통해서 run()합니다.
	 * 	start method는 java.lang.Thread 클래스의 메소드입니다.
	 * 	새로 생성한 Thread를 start하면 Runnable 상태가 됩니다.
	 * -thread.run(); 이렇게 호출하지 않습니다,.
	 * */
	
	for (char ch = 'A' ; ch<='Z'; ch++)
		System.out.print(ch);
	
	System.out.println("스레드 이름 : "+Thread.currentThread().getName());
	}

		
}
