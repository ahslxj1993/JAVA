package ex17_12_notifyAll_wait;

public class LuxuryPrintThread extends Thread{
	private SharedArea sharedArea;
	
	LuxuryPrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		if(sharedArea.isReady() != true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait();//��ȣ�� ��ٸ��ϴ�
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}//catch end
			}//����ȭ end
		}//if end
		System.out.println("*** �� = "+sharedArea.getResult() + " ***");
	}
}
