package ex17_09_syn_solution;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {

		for (int cnt = 0; cnt < 3; cnt++) {
			//����ȭ ����
			synchronized(sharedArea) {
			int sum = sharedArea.getAccount1().getBalance() + sharedArea.getAccount2().getBalance();
			System.out.println("�����ܾ� �հ� : " + sum);
			}
			//����ȭ ��
			try {
				Thread.sleep(1);// 1��
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
