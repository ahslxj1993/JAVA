package ex17_04_Runnable_Interface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main {
	public static void main(String [] args) {
		Thread t  = new Thread(){

			public void run() {
				for (;;) {
					Date d = new Date();
					SimpleDateFormat time = new SimpleDateFormat("yyyy��MM��dd�� E���� hh��mm��ss��");
					System.out.println(time.format(d));
					try {
						Thread.sleep(1000);// 1��
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		
		    
		   };
		t.start();
	}
}
