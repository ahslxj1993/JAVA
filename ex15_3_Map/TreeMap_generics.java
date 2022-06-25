package ex15_3_Map;
import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 *	Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����մϴ�.
 *	�˻��� ���Ŀ� ������ �÷��� Ŭ�����Դϴ�.
 * */


public class TreeMap_generics {
	public static void main(String[] args) {
		//HashMap��ü���� ��� �ΰ���
		//���1. ��ĳ����
		//Map <String,String > tm = new TreeMap<String,String>();      
		
		//���2. ���� Ŭ������ ���� ��ü����
		TreeMap<String, String> tm = new TreeMap<String,String>();
		
		//Key�� Value ���� ����
		//Map�� put()�� �̿��� (Key, Value) ������ �ڷ� �����մϴ�.
		tm.put("woman", "����ִ�");
		tm.put("man", "�����Ϸ�");
		tm.put("age", new String("10"));
		tm.put("city","Seoul");
		tm.put("city","Busan");
		
		//��¹�� 1. �ش� ��ü������ ���
		System.out.println(tm);
		//{woman = ����ִ�, city=Seoul, man=�����Ϸ�,age=10}
		
		//��¹��2. key���� ���
		
		System.out.println(tm.keySet());
		//��¹��3. value ���� ���
		System.out.println(tm.values());
		//��¹��4.
		//get(key): key �� �ش��ϴ� value�� ��� - ���� ���� ���
		System.out.println(tm.get("woman"));//����ִ�
		System.out.println(tm.get("city"));//Busan
		
		//��¹��5.
		System.out.println("=======================");
		Set<String> keys = tm.keySet();
		for (String key: keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}
	
}
