package ex05_03_while;

public class calender {
	public static void main(String args[]) {
		System.out.printf("");
		int day=0;
		while (++day<32){
			System.out.printf("%5d",day);
				if (day%7 ==0) {
					System.out.printf("%n");
				}
			}
		
	}

}
