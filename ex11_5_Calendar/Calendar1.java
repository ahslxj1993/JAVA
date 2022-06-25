package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar1 {
	public static void main (String [] args) {
		//기본적으로 현재날짜와 시간으로 설정됩니다.
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));//public final static int YEAR = 1;
		
		System.out.println("월(0~11 , 0:1월) : " +today.get(Calendar.MONTH)); // public final static int MONTH = 2;
		
		System.out.println("월(0~11 , 0:1월) : " +(today.get(Calendar.MONTH)+1));
		
		System.out.println("이 해의 몇 째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("이 달의 몇 째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 며칠 : " + today.get(Calendar.DATE));
		
		System.out.println("이 달의 며칠 : "+today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이 해의 며칠 : "+today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7, 1:일요일) : "+today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이 달의 몇번째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전_오후 (0:오전, 1:오후) : "+today.get(Calendar.AM_PM));
		
		System.out.println("시간(0~11): "+today.get(Calendar.HOUR));
		
		System.out.println("시간(0~23): "+today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("분 (0~59):"+today.get(Calendar.MINUTE));
		
		System.out.println("초 (0~59) : "+today.get(Calendar.SECOND));
		
		System.out.println("이달의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));
		
		System.out.println("이달의 1000분의 1초(0~999) : "+today.get(Calendar.MILLISECOND));
		
		
		System.out.print(today.get(Calendar.YEAR)+"년 "+
							today.get(Calendar.MONTH+1)+"월 "+
							today.get(Calendar.DATE)+"일 "+
							today.get(Calendar.AM_PM)+" "+
							today.get(Calendar.HOUR)+":"+
							today.get(Calendar.MINUTE)+":"+
							today.get(Calendar.SECOND)+"초 ");
		
		int date = today.get(Calendar.DAY_OF_WEEK);
		if (date%7 == 0) {
			System.out.println("토요일");
		} else if (date%7 ==1){
			System.out.println("일요일");
		}else if (date%7 ==2){
			System.out.println("월요일");
		}else if (date%7 ==3){
			System.out.println("화요일");
		}else if (date%7 ==4){
			System.out.println("수요일");
		}else if (date%7 ==5){
			System.out.println("목요일");
		}else if (date%7 ==6){
			System.out.println("금요일");
		}
		
	}//main

	
	
}
