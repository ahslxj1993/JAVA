package ex17_05.daemon_thread;
/*������� �Ϲ� ������� ���� ������� �����ϴ�..
 * 
 * ���󾲷���(daemon thread)��
 * 	 �ٸ� �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� �������Դϴ�.
 * 	�Ϲ� �����尡 ��� ����Ǹ� ���� ������� ���������� �ڵ� ����˴ϴ�.
 * 	���� ������� �Ϲ� �������� ���� ������ �����ϹǷ� �Ϲ� �����尡 ��� ����ǰ� ���� ���󾲷����� ���� �ǹ̰� ���� ����
 * �Դϴ�.
 * �� ���� �����ϰ�� ���� ������� �Ϲ� ������� �ٸ��� �ʽ��ϴ�.
 * ���� �������� ���δ� �������÷���, �������μ����� �ڵ�����, ȭ���ڵ����� ���� �ֽ��ϴ�.
 * 
 * ���� ������� ���� ������ ���ǹ��� �̿��ؼ� ������ ����ϰ� �ִٰ� Ư�� ������ �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ���
 * �ۼ��մϴ�.
 * 
 * ���󾲷��� ����
 * 	������ ����-> �ݵ��  setDaemon(true) �޼��� ȣ�� -> start() �޼��� ȣ��
 * void setDaemon(boolean on) : true(���� ������� ����),
 * 								false (�Ϲ� ������� ����)
 *
 * 
 * */
public class Threadautosave implements Runnable {
	static boolean autosave = false;
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(3*1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(autosave) {
				autoSave();
			}
		}
	}

	private void autoSave() {
		System.out.println("�۾������� �ڵ����� �Ǿ����ϴ�.");
		
	}
	
}
