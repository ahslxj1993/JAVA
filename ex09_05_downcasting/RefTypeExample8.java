package ex09_05_downcasting;

public class RefTypeExample8 {
	public static void main (String args[]) {
		Account obj1 = new CheckingAccount("111-22-333333333","ȫ�浿",100000,
				"555-6666-7777-8888");
		CheckingAccount obj2 = (CheckingAccount) obj1;
		
		try {}
		catch (Exception e){
			
		}
	}
}
