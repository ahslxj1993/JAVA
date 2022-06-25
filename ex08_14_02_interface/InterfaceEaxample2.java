package ex08_14_02_interface;

public class InterfaceEaxample2 {
	public static void main(String [] args) {
		SeparateVolume obj1 = new SeparateVolume("86ㅂ3774개","개미","베르베르");
		obj1.checkOut("홍길동", "2021-10-25");
		obj1.checkIn();
		
		AppCDInfo obj2= new AppCDInfo("2005-7001","Redhat Fedora");
		obj2.checkOut("홍길동", "2021-10-25");
		obj2.checkIn();
	}
}
