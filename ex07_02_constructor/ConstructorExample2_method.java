package ex07_02_constructor;

public class ConstructorExample2_method {
	public static void main (String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("�����","poorman","zebi");
		print(obj1);
		
		obj1.setPhoneNo("010-7777-7777");
		obj1.setAddress("����� ���α�");
		print(obj1);
		
		SubscriberInfo obj2 = new SubscriberInfo("�����","richman","money","02-123-4567","����");
		
		print (obj2);
		
	}
	
	public static void print(SubscriberInfo obj) {
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.password);
		System.out.println(obj.phoneNo);
		System.out.println(obj.address);
		System.out.println();
	}
}
