package Homework001;

import java.util.*;

public class Homework_02 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
	
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); //입력받은 월로 세팅
		cal.set(year,month-1,1); //입력받은 년, 월의 1일로 세팅

		System.out.println("			"+year+"년 "+month+"월");
		System.out.println("	일	월	화	수	목	금	토");
		System.out.println("================================================================");

		
		int end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)
		

		for(int i=1; i<=end; i++) {//1일부터 해당 월의 마지막 날짜까지 반복문
			if(i==1) {//1일 일때 앞에 요일수 만큼의 공백을 줘야함
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("	");
				}//dayOfWeek에 해당 날짜의 요일(숫자)이 들어가서 그만큼 공백을 줄수 있다. 
			}
			System.out.print("	"+i); // 1일부터 해당 월의 마지막 날짜까지 공백을 주고 출력
			if(dayOfWeek%7==0) { //토요일이면 줄바꿈
				System.out.println();
			}
			dayOfWeek++;//요일은 1~7까지 1씩 증가하는 루프를 반복함
		}
		sc.close();
	} //main
}

