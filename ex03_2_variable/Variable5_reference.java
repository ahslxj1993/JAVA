package ex03_2_variable;

public class Variable5_reference {
	public static void main(String[] args) {
		//������-s1,s2�� �޸��ּ�, new�� ������,
		//new String("�ڹ�"); ���� String("�ڹ�")�� ������
		String s1 = "�ڹ�";
		
		
		//��ü����
		//Ŭ����	����������	= ������	������ ȣ��
		String	s2		= new	String("�ڹ�");//String�� ���̺귯���� �����Ǵ� Ŭ����
		
		System.out.println("s1="+s1+" s2= "+s2);
	}
}
