//�߻�޼ҵ忡 throws���� �߰��� ���Ⱑ�� �������̽�
//���� Ŭ�������� throws���� ����� ���
//�������̽������� throws���� �ۼ��� �־�� �Ѵ�
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� �����Ҽ� �����ϴ�.,
package ex08_17_interface_exception;

import java.io.IOException;

public interface Lendable3 {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL =0;
	
	abstract void checkOut(String borrower, String date)
		throws IOException;
	void checkIn();
}
