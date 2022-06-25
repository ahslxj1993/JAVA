package ex07_00_object;

public class Saram_make {
	public static void main(String[]args) {
		
		Saram2 s = new Saram2 ();
		s.name="수지";
		s.ki=169;
		s.age=27;
		s.eat();
		s.sesu();
		s.walk();
		
		
		Saram6 s2 =new Saram6("박보검",65,182,23);
		s2.age =24;
		s2.ki=182;
		s2.eat();
		s2.walk();
		
		Saram6 s3 = new Saram6("홍길동",80.5);
		s3.age =18;
		
		
	}
}