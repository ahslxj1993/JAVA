package ex17_11_syn_format2;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {

		for (int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea.getTotal();
			
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è : "+sum);
						try {
				Thread.sleep(1);// 1ÃÊ
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
