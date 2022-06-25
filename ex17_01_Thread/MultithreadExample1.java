package ex17_01_Thread;



public class MultithreadExample1 {
	public static void main (String [] args) {
			Thread thread = new DigitThread();//������ ����
	//������ ����
	thread.start();
	
	/*-start() ����:
	 * 	Causes this thread to begin execution;
	 * the Java Virtual Machine calls the run method of this thread.
	 * 
	 * this thread(Thread thread = new DigitThread()�� thread)�� ������ �����ϵ��� �մϴ�.
	 * Java ���� �ӽ��� �������� run()�޼ҵ带 ȣ���մϴ�.
	 * -start()�� ���ؼ� run()�մϴ�.
	 * 	start method�� java.lang.Thread Ŭ������ �޼ҵ��Դϴ�.
	 * 	���� ������ Thread�� start�ϸ� Runnable ���°� �˴ϴ�.
	 * -thread.run(); �̷��� ȣ������ �ʽ��ϴ�,.
	 * */
	
	for (char ch = 'A' ; ch<='Z'; ch++)
		System.out.print(ch);
	
	System.out.println("������ �̸� : "+Thread.currentThread().getName());
	}

		
}
