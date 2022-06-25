package ex07_00_object;

class Saram5 {
	//필드(멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	//생성자
	Saram5 (String name2 , double w2){
		name=name2;
		w=w2;
	}
	
	//
	Saram5 (double w2, String name2){
		name = name2;
		w= w2;
	}
	
	//메서드
	public void eat() {
		System.out.println(name +"이(가) 밥을 먹는다.");
	}
	
	public void walk() {
		System.out.println(name +"이(가) 걷기전 몸무게는"+w+"입니다.");
	}
	
	public void sesu() {
		System.out.println(name +"이(가) 세수한다.");
	}
}
