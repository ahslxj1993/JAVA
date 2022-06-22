package ex17_09_syn_solution;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {

		for (int cnt = 0; cnt < 3; cnt++) {
			//동기화 시작
			synchronized(sharedArea) {
			int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
			System.out.println("계좌잔액 합계 : " + sum);
			}
			//동기화 끝
			try {
				Thread.sleep(1);// 1초
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
