//�߻�޼ҵ忡 throws���� �߰��� ���Ⱑ�� �������̽�
//���� Ŭ�������� throws���� ����� ���
//�������̽������� throws���� �ۼ��� �־�� �Ѵ�
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� �����Ҽ� �����ϴ�.,


package ex08_17_interface_exception;
public interface Lendable2 {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL =0;
	
	abstract void checkOut(String borrower, String date)
		throws Exception;
	void checkIn();
}
