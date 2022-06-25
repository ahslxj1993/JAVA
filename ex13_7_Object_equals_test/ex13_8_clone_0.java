package ex13_7_Object_equals_test;
/*clone() �޼ҵ�� ��ü�� �����ϴ� ����� �մϴ�.
 * �� �Ȱ��� ���� ���� ��ü�� �Ѱ��� ����ϴ�
 * ���� ������ Ŭ������ ���ؼ��� ȣ���Ҽ� �ֽ��ϴ�
 * ���� ������ Ŭ������ Cloneable �������̽� ���� �����Դϴ�.
 *
 * */

//Cloneable �������̽��� ������ GregorianCalendar Ŭ������ ���ؼ�
//clone()�޼ҵ带 ȣ���ϴ� ����
import java.util.GregorianCalendar;
public class ex13_8_clone_0 {
	public static void main (String [] args) {
		//��ü ����
		GregorianCalendar obj1 = new GregorianCalendar(2020,11,1);
		//clone �޼���� ��ü�� ����
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar) imsi;
		//�� �ι����� �ѹ������� ǥ���ϸ� ������ ����
		//GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF ���� ���ڴ� ��¥�� yyyy-MM-dd �������� �����ϴ� ������ �Ѵ�
		System.out.printf("%tF %n",obj1);
		System.out.printf("%tF %n",obj2);
		
		obj1.set(2021,5,1);
		System.out.printf("%tF %n",obj1);
		System.out.printf("%tF %n",obj2);
	}
	

	}

