package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExaple2_GregorianCalendar {
	public static void main(String [] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd a h m ss E");
		System.out.println(sdf);
	}
}
