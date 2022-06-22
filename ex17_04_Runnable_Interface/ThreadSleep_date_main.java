package ex17_04_Runnable_Interface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date_main {
	public static void main(String [] args) {
		Thread t  = new Thread(){

			public void run() {
				for (;;) {
					Date d = new Date();
					SimpleDateFormat time = new SimpleDateFormat("yyyy년MM월dd일 E요일 hh시mm분ss초");
					System.out.println(time.format(d));
					try {
						Thread.sleep(1000);// 1초
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		
		    
		   };
		t.start();
	}
}
