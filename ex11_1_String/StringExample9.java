package ex11_1_String;

public class StringExample9 {
	public static void main(String[] args) {
		String message = "Java program creates many objects.";
		
		int index1 = message.indexOf('a');
		//������ ���ڰ� ���ʷ� ��ġ�� �ε����� ���մϴ�
		//�������� �ʴ°�� -1�� �����մϴ�
		//���ڿ� �տ������� ���ʴ�� �˻��մϴ�,.
		System.out.println("a�� ��ġ�� "+ index1);
		
		int index2 = message.indexOf(97);
		//�ƽ�Ű�ڵ� 97�� �ҹ��� 'a'
		System.out.println("a�� ��ġ�� "+ index2);
		
		int index23 = message.indexOf(65);
		//�ƽ�Ű�ڵ� 75�� �빮�� 'A'
		System.out.println("A�� ��ġ�� "+index23);
		
		int index3 = message.indexOf('a',13);
		//index��ȣ 13��° ���� 'a'�� ã���ϴ�.
		System.out.println("13�� ���� a �� ��ġ�� "+index3);
		
		int index4 = message.indexOf("av");
		//"av"�� ���� index�� ã���ϴ�.
		System.out.println("av�� �����ϴ� index�� "+index4);
		
		int index5 = message.indexOf("man",12);
		//index��ȣ 12 ��°���� "man"�� ���� index�� ã���ϴ�,
		System.out.println("12��° ��ġ���� man�� ��ġ�� "+index5);
		
		int index6 = message.indexOf("java");
		System.out.println("java�� ��ġ�� "+index6);
}//main end
}
