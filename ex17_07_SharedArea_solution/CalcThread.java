package ex17_07_SharedArea_solution;

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

		// 계산 결과를 공유 영역에 저장
		 sharedArea.setResult(total*4);
		 
		 //SharedArea 객체의 setReady 필드값을 true로 바꿔준다
		 sharedArea.setReady(true);
	}

}
