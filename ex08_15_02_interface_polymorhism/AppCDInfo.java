package ex08_15_02_interface_polymorhism;

class AppCDInfo extends CDInfo implements Lendable{
	String borrower; //대출인
	String checkOutDate; //대출일
	byte state; //대출상태
	String writer;

	AppCDInfo(String registerNo, String title, String writer) {
		super(registerNo, title);
		this.writer = writer;
	}

	
	public void checkOut(String borrower, String date) {
		if (state != 0)  return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+title+" CD가 대출되었습니다.");
		System.out.println("저  자 : "+ writer);
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date+"\n");
	}

	public void checkIn() {
		this.borrower= null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+title+" CD가 반납되었습니다.\n");
	}



}
