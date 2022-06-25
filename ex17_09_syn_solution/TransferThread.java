package ex17_09_syn_solution;

public class TransferThread extends Thread {
	private SharedArea sharedArea;
	
	TransferThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run(){
		
		for (int cnt=0 ; cnt<12 ; cnt++) {
			//동기화 시작
			synchronized(sharedArea) {
			sharedArea.getAccount1().withdraw(1000000);
			System.out.print("이몽룡 계좌 : 100만원 인출 , ");
			sharedArea.getAccount2().deposit(1000000);
			System.out.print("성춘향 계좌 : 100만원 입금 \n");
			}
			//동기화 끝
		}
	}
}
