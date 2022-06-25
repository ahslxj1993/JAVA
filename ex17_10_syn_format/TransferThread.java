package ex17_10_syn_format;

public class TransferThread extends Thread {
	private SharedArea sharedArea;
	
	TransferThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run(){
		
		for (int cnt=0 ; cnt<12 ; cnt++) {
			sharedArea.transfer();
		}
	}
}
