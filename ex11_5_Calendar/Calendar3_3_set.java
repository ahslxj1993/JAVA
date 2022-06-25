package ex11_5_Calendar;

import java.util.GregorianCalendar;

public class Calendar3_3_set {
	public static void main (String [] args) {
		GregorianCalendar g = new GregorianCalendar();
		
		g.set(2022,4,2);
		Today t3 = new Today(g);
		System.out.println(t3);
		
	}
}
