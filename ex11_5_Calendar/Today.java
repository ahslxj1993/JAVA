package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
	Calendar c1 = new GregorianCalendar();

	public Today(Calendar cal) {
		this.c1 = cal;
	}
	
	public Today() {}

	public String toString() {
		String []yo = {"일","월","화","수","목","금","토"};
		String [] ampm = {"오전 ","오후 "};
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get((Calendar.MONTH)+1);
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		
		return y+"년 "+m+"월 "+d+"일 "+ampm[ap]+h1+":"+mm+":"+s+" "+yo[yoil-1]+" 입니다";
	}
	

}
