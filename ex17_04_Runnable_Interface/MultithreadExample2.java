//Runnable �������̽��� �̿��� ��Ƽ������ ���α׷�
package ex17_04_Runnable_Interface;
public class MultithreadExample2 {
	public static void main (String [] args) {
		
		//�͸�����
		//�� Ŭ���������� �����带 ����ϰ������ ����ϸ� �˴ϴ�
		Thread thread  = new Thread(new Runnable(){

		    public void run() {
		            for (char ch = 'a'; ch <= 'z'; ch++)
		               System.out.print(ch);
		    }
		    
		   });
		
		thread.start();

		
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		
		for (char chr : arr)
			System.out.print(chr);
	}
}
