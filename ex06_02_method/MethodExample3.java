package ex06_02_method;

public class MethodExample3 {
	public static void main(String args[]) {
		hap(1,10);//�ƹ��͵� ��µ��� �ʽ��ϴ�.
		
		//1. return sum�� ���� �����ؼ� ����ϴ¹��
		int result = hap(1,100);
		System.out.println("1. result = "+result);
		
		//2. ��¹����� �޼��� ȣ���ϴ� ���
		System.out.println("��¹� �ȿ��� ȣ�� : "+hap(1,5));
		
	}
				//��ȯ��
	public static int hap(int start, int end) {
		int sum=0;
		for(int i=start ; i<=end ; i++) {
			sum =sum + i;
		} 
		return sum; //sum�� �ڷ����� �޼����� ��ȯ���� ��ġ�ؾ� �Ѵ�.
		
	}
}
