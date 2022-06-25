package ex08_16_interface_polymorhism;

public interface Lendable {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL =0;
	
	void checkOut(String borrower, String date);
	void checkIn();
}
