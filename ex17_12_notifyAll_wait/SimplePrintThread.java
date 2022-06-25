package ex17_12_notifyAll_wait;

public class SimplePrintThread extends Thread{
	private SharedArea sharedArea;

	SimplePrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		if (sharedArea.isReady() != true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				} 
			} 
		}
		System.out.printf("SimplePrintThread : %.2f %n", sharedArea.getResult());
	}
}