package ex14_1_Wrapper;
//�⺻�� �� -> Wrapper ��ü���� �ڵ�(����) Boxing
public class Wrapper7_auto_boxing {
	public static void main(String args[]) {
		printDouble(Double.valueOf(123.45));
		
		//double Ÿ���� ���� ������ DoubleŸ�� ���ڸ� �޴� �޼ҵ带 ȣ���մϴ�.
		printDouble(123.45);
		//printDouble(Double.valueOf(123.456D)); �� ��ȯ�˴ϴ�.
	}
	//�ڵ�(����) Boxing
	static void printDouble(Double obj) {
		System.out.println("obj ="+obj);
		System.out.println("obj.doubleValue() = "+obj.doubleValue());
		System.out.println("obj.toString() = "+obj.toString());
	}
}
