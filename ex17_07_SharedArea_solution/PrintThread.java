package ex17_07_SharedArea_solution;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		//SharedArea 객체의 isReady필드 값이 true가 될때까지 반복힌다.
		while(sharedArea.isReady() !=true) {
			System.out.println("실행중입니다");
		}
		
	System.out.println("공유 영역의 데이터 = "+sharedArea.getResult());	
	}
}
