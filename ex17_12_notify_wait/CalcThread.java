//파이를 계산하는 클래스
package ex17_12_notify_wait;

public class CalcThread extends Thread {
	private SharedArea sharedArea;

	CalcThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;

		 sharedArea.setResult(total*4);
		 sharedArea.setReady(true);//파이 계산이 끝났다 라는 의미
		 
		 synchronized(sharedArea) {
			 sharedArea.notify();//다른 스레드로 신호를 보내는 메소드
			 						//즉, 신호를 기다리고 있는 것도 있다는 의미
		 }
	}

}
