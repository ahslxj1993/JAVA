package ex08_16_interface_polymorhism;

public class InterfaceExample {
	public static void main(String args[]) {
		SeparateVolume obj = new SeparateVolume("863ㅂ","나무","베르베르");
		
		printState(obj);
		
		obj.checkOut("수지","2022-06-02");
		
		printState(obj);
	}

	private static void printState(SeparateVolume obj) {
		
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("--------------");
			System.out.println("대출 상태 : 가능");
			System.out.println("--------------");
		} else if(obj.state == Lendable.STATE_BORROWED) {
			System.out.println("---------------");
			System.out.println("대출 상태 : 대출중");
			System.out.println("대출인 : "+obj.borrower);
			System.out.println("대출일 : "+obj.checkOutDate);
			System.out.println("----------------");
		}
	}
}
