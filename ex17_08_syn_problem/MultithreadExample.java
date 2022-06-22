package ex17_08_syn_problem;
//계좌 이체와 잔액 합계 출력을 동시에 하는 멀티스레드 프로그램
/*-이몽룡의 계좌에서 인출된 100만원이 성춘향의 계좌로 입금되기전에
 * PrintThread로 실행제어가 넘어가 계좌잔액 합계 29000000 출력되었습니다.
 * 
 * -문제 해결법!
 * 		동기화: 공유데이터 사용중에 그 공유 데이터를 다른 스레드가 사용하지 못하도록
 * 				만든느 것을 의미합니다.
 * */


public class MultithreadExample {
	public static void main (String args[]) {
		Account a1 = new Account("111-111-1111","이몽룡",20000000);
		Account a2 = new Account("222-222-2222","성춘향",10000000);
		
		SharedArea area = new SharedArea(a1,a2);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		
		thread1.start();
		thread2.start();
	}
}
