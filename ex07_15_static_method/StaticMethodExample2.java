package ex07_15_static_method;

//���� �޼ҵ� ȣ���ϴ� ���α׷�
public class StaticMethodExample2 {
	public static void main(String args[]) {
		// ���� �޼��� ȣ�⹮
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("�Ѱ� = " + grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);

		// ���� �޼��� ȣ�⹮
		grandTotal = Accumulator.getGrandTotal();

		// �ν��Ͻ� �޼��� print()�� ���� �޼����� main()���� ȣ���Ҽ� �����ϴ�.

		//print(obj1);
		//print(obj2);// �� �޼��带 ����ϱ� ���ؼ���?
						//-> ��ü���������־�� �մϴ�
		StaticMethodExample2 s = new StaticMethodExample2();
		s.print(obj1);
		s.print(obj2);
		System.out.println("�Ѱ� = " + grandTotal);
	}// main() end

	void print(Accumulator a) {
		System.out.println("total = " + a.total);
	}// print end
}
