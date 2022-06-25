package ex17_12_notifyAll_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		if (sharedArea.isReady() != true) {//���̰� ������ΰ��
			/*
			 * ������ ��� - ���̰���� ���������� ��� üũ �߾�� �߽��ϴ�
			 * while(sharedArea.isReady() !=true) {
			System.out.println("�������Դϴ�");
			}	
			 * */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//�ٸ� ������κ��� ��ȣ�� ��ٸ��ϴ�.
									//������ ����� ������ �ٸ� �����忡�� ��ȣ�� �����ϴ�.
				}
			}//try end
			catch (InterruptedException e) {//wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		
		
	System.out.println("PrintThread = "+sharedArea.getResult());	
	}
}
