package ex08_15_02_interface_polymorhism;
interface Lendable {
	//대출한다
	void checkOut(String borrower, String date);
	
	//반납한다
	void checkIn();
}
