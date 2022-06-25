package ex17_12_notifyAll_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		if (sharedArea.isReady() != true) {//파이가 계산중인경우
			/*
			 * 이전의 방식 - 파이계산이 끝날때까지 계속 체크 했어야 했습니다
			 * while(sharedArea.isReady() !=true) {
			System.out.println("실행중입니다");
			}	
			 * */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//다른 스레드로부터 신호를 기다립니다.
									//파이의 계산이 끝나면 다른 스레드에서 신호를 보냅니다.
				}
			}//try end
			catch (InterruptedException e) {//wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		
		
	System.out.println("PrintThread = "+sharedArea.getResult());	
	}
}
