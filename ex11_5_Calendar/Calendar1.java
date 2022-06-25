package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar1 {
	public static void main (String [] args) {
		//�⺻������ ���糯¥�� �ð����� �����˴ϴ�.
		Calendar today = Calendar.getInstance();
		
		System.out.println("�� ���� �⵵ : "+ today.get(Calendar.YEAR));//public final static int YEAR = 1;
		
		System.out.println("��(0~11 , 0:1��) : " +today.get(Calendar.MONTH)); // public final static int MONTH = 2;
		
		System.out.println("��(0~11 , 0:1��) : " +(today.get(Calendar.MONTH)+1));
		
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ : " + today.get(Calendar.DATE));
		
		System.out.println("�� ���� ��ĥ : "+today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ : "+today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("����(1~7, 1:�Ͽ���) : "+today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�� ���� ���° ���� : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("����_���� (0:����, 1:����) : "+today.get(Calendar.AM_PM));
		
		System.out.println("�ð�(0~11): "+today.get(Calendar.HOUR));
		
		System.out.println("�ð�(0~23): "+today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("�� (0~59):"+today.get(Calendar.MINUTE));
		
		System.out.println("�� (0~59) : "+today.get(Calendar.SECOND));
		
		System.out.println("�̴��� ������ �� : "+today.getActualMaximum(Calendar.DATE));
		
		System.out.println("�̴��� 1000���� 1��(0~999) : "+today.get(Calendar.MILLISECOND));
		
		
		System.out.print(today.get(Calendar.YEAR)+"�� "+
							today.get(Calendar.MONTH+1)+"�� "+
							today.get(Calendar.DATE)+"�� "+
							today.get(Calendar.AM_PM)+" "+
							today.get(Calendar.HOUR)+":"+
							today.get(Calendar.MINUTE)+":"+
							today.get(Calendar.SECOND)+"�� ");
		
		int date = today.get(Calendar.DAY_OF_WEEK);
		if (date%7 == 0) {
			System.out.println("�����");
		} else if (date%7 ==1){
			System.out.println("�Ͽ���");
		}else if (date%7 ==2){
			System.out.println("������");
		}else if (date%7 ==3){
			System.out.println("ȭ����");
		}else if (date%7 ==4){
			System.out.println("������");
		}else if (date%7 ==5){
			System.out.println("�����");
		}else if (date%7 ==6){
			System.out.println("�ݿ���");
		}
		
	}//main

	
	
}
