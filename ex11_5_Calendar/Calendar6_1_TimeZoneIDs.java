package ex11_5_Calendar;

import java.util.GregorianCalendar;

public class Calendar6_1_TimeZoneIDs {
	public static void main (String [] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println("���� Ÿ����"+cal.getTimeZone().getID());
		
		System.out.println();
	}
}
