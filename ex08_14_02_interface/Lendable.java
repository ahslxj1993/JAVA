package ex08_14_02_interface;
interface Lendable {
	//�����Ѵ�
	public abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�
	public abstract void checkIn();
}
