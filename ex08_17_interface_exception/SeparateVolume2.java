package ex08_17_interface_exception;

class SeparateVolume2 implements Lendable2 {
	String requestNo; //û����ȣ
	String bookTitle; //����
	String writer; //����
	String borrower; //������
	String checkOutDate; //������
	byte state; //�������
	
	SeparateVolume2(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		
	}

	public void checkOut(String borrower, String date) throws Exception{
		if (state != STATE_NORMAL) 
			throw new Exception("*����Ұ� : "+bookTitle); //byte state�� �ʱ� ����? (0)
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED; //������´� state�� 1�϶�
		System.out.println("*"+bookTitle+"��(��) ����Ǿ����ϴ�.");
		System.out.println("��  �� : " + writer);// �߰��� �κ�
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+date+"\n");
	}

	public void checkIn() { //�ݳ��Ѵ�
		this.borrower= null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL; //�ݳ����´� state �� 0
		System.out.println("*"+bookTitle+" ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

	
}