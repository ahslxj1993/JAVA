package ex07_06_constructor_call;

public class ConstrExample4 {
	public static void main (String args[]) {
		SubscriberInfo obj
		 =new SubscriberInfo("���ӽ� ����","Java","Java","010-111-222","���� ã�� ������~");
		
		printSubscriberInfo(obj);
		
	}
	
	public static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.password);
		System.out.println(obj.phoneNo);
		System.out.println(obj.address);
		System.out.println();
	}
}
