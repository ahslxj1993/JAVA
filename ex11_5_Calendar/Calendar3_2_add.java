package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar3_2_add {
	public static void main(String [] args) {
		GregorianCalendar c = new GregorianCalendar();
		
		c.add(Calendar.DATE,1);
		System.out.println("1 증가된 날 = "+c.get(Calendar.DATE));
		print(c);
		
		c.add(Calendar.MONTH, 1);
		System.out.println("1 증가된 달 = "+(c.get(Calendar.MONTH)+1));
		print(c);
		
		c.add(Calendar.YEAR, 1);
		System.out.println("1 증가된 년도 = "+c.get(Calendar.YEAR));
		print(c);
		
		c.add(Calendar.DATE, -1);
		System.out.println("1 감소된 날 = "+c.get(Calendar.DATE));
		print(c);
		
		c.add(Calendar.MONTH, -1);
		System.out.println("1 감소된 달 = "+(c.get(Calendar.MONTH)+1));
		print(c);
		
		c.add(Calendar.YEAR, -1);
		System.out.println("1 감소된 달 = "+c.get(Calendar.YEAR));
		
		
		print(c);
	}
	
	
	private static void print (GregorianCalendar c) {
		Today t = new Today(c);
		System.out.print(t.toString()+"\n");
	}
}
