package ex14_1_Wrapper;
/*
 * ������Ƽ�� Ÿ���� ��Ʈ ������ ���ڿ��� �����ϴ� �޼ҵ�
 * toBinaryString(����) - 2����
 * Integer.toOctalString(����) - 8����
 * Integer.toHexString(����) - 16����
 * */

public class Wrapper3_2_int_bit_to_String {
	public static void main (String args[]) {
		int num =0;
		
		for(int cnt =0; cnt<args.length; cnt++) {
			//���ڷ� ���� ���ڿ��� intŸ���� ������ �ٲپ �ջ��մϴ�
			num+= Integer.parseInt(args[cnt]);
			
		}
		
		System.out.println("���� = "+num);
		System.out.println("10���� : "+num +"\t 2���� :"+ Integer.toBinaryString(num));
		System.out.println("10���� : "+num +"\t 8���� :"+ Integer.toOctalString(num));
		System.out.println("10���� : "+num +"\t 16���� :"+ Integer.toHexString(num));

	}
}
