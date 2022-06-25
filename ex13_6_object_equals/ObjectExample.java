package ex13_6_object_equals;
//equals �޼ҵ� ��� �� - �Ȱ��� ���� ���� �ΰ��� ��ü�� ����

/*
 * Object Ŭ������ equals()�޼ҵ�
 * �Ű� ������ ��ü�� ���������� �޾Ƽ� ���Ͽ� �� ����� boolean ������
 * �˷��ִ� ������ �մϴ�
 * 
 * ������ equals �޼ҵ��� ���� �����Դϴ�.
 * 	public boolean equals(Object arg0){
 * 				return this == arg0}
 * 
 * �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��ϰ� �ֽ��ϴ�.
 * ���δٸ� �� ��ü�� equals �޼ҵ�� ���ϸ� �׻� false ����� ��� �˴ϴ�.
 * */

import java.util.GregorianCalendar;

public class ObjectExample {
	public static void main (String [] args) {
		GregorianCalendar obj1 = new GregorianCalendar(2021,5,1);
		GregorianCalendar obj2 = new GregorianCalendar(2021,5,1);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("=================================================================================");
		System.out.println(obj1.toString()); //�������̵� �Ǿ��ֽ��ϴ�
		System.out.println(obj2.toString());
		System.out.println("==================================================================================");
		
		if(obj1.equals(obj2)) { //�������̵� �Ǿ��ֽ��ϴ�
			System.out.println("obj1. equals(obj2) : ����");
		}
		else {
			System.out.println("obj1. equals(obj2) : �ٸ�");
		}
		
		if(obj1==obj2) {
			System.out.println("obj1 == obj2 : ����");
		}
		else {
			System.out.println("obj1 == obj2 : �ٸ�");
		}
	}
}
