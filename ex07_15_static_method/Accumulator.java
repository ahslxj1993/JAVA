package ex07_15_static_method;
//���� �޼ҵ尡 �ִ� Ŭ����
//total �ʵ�� ��ü���� ���� ��������
//grandTotal �ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ��̴�.

class Accumulator {
	int total ;
	static int grandTotal ; // ���� �ʵ带 �����ϴ� ����

	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	/*
	 *���� �޼��� �ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼��带 ����Ҽ� �����ϴ�.
	 *�ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
	 *�ν��Ͻ� ������ ���þ��� static �޼��� �ȿ����� ����Ҽ� �����ϴ�.
	 *���� this�� ����Ҽ� �����ϴ�. 
	*/
	
	static int getGrandTotal() {//���� �޼��� ����
		//total=5;//�����߻�	
		//accumulate(100);//�����߻�
		return grandTotal;
		
}
}
