package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample1_Date {
	public static void main(String [] args) {
		
		Date d = new Date();
		System.out.println("Date 사용 : "+d);
		
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));
		
		SimpleDateFormat sd3 =
				new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		
		System.out.println(sd3.format(d));
	}
}
