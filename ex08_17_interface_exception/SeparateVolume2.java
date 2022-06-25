package ex08_17_interface_exception;

class SeparateVolume2 implements Lendable2 {
	String requestNo; //청구번호
	String bookTitle; //제목
	String writer; //저자
	String borrower; //대출인
	String checkOutDate; //대출일
	byte state; //대출상태
	
	SeparateVolume2(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		
	}

	public void checkOut(String borrower, String date) throws Exception{
		if (state != STATE_NORMAL) 
			throw new Exception("*대출불가 : "+bookTitle); //byte state의 초기 값은? (0)
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED; //대출상태는 state가 1일때
		System.out.println("*"+bookTitle+"이(가) 대출되었습니다.");
		System.out.println("저  자 : " + writer);// 추가된 부분
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+date+"\n");
	}

	public void checkIn() { //반납한다
		this.borrower= null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL; //반납상태는 state 가 0
		System.out.println("*"+bookTitle+" 이(가) 반납되었습니다.\n");
	}

	
}
