//Runnable �������̽��� �̿��� ��Ƽ������ ���α׷�
package ex17_04_Runnable_Interface;
public class MultithreadExample1 {
	public static void main (String [] args) {
		//Runnable �������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ�
		//Thread �������� �Ķ���ͷ� ���
		SmallLetters small = new SmallLetters();
		Thread thread = new Thread(small);
		thread.start();
		
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		
		for (char chr : arr)
			System.out.print(chr);
	}
}
