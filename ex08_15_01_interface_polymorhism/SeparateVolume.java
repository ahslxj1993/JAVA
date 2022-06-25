package ex08_15_01_interface_polymorhism;

class SeparateVolume implements Lendable {
	String requestNo; //û����ȣ
	String bookTitle; //����
	String writer; //����
	String borrower; //������
	String checkOutDate; //������
	byte state; //�������
	
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		
	}

	public void checkOut(String borrower, String date) {
		if (state != 0)  return; //byte state�� �ʱ� ����? (0)
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; //������´� state�� 1�϶�
		System.out.println("*"+bookTitle+"��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+date+"\n");
	}

	public void checkIn() { //�ݳ��Ѵ�
		this.borrower= null;
		this.checkOutDate = null;
		this.state = 0; //�ݳ����´� state �� 0
		System.out.println("*"+bookTitle+" ��(��) �ݳ��Ǿ����ϴ�.\n");
	}

	
}
