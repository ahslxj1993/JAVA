package ex08_15_01_interface_polymorhism;

public class InterfaceExample {
	public static void main() {
		Lendable arr0, arr1, arr2;
		//arr0 = new Lendable(); //오류발생
		arr0=new SeparateVolume("883ㅇ","푸코의 진자","에코");
		arr1=new SeparateVolume("609.2","서양미술사","곰브리치");
		arr2=new AppCDInfo("02-17","마이크로서비스를 위한 자바 프로그래밍");
		
		//같은 사람이 같은 날짜에 단행본 2권과 부록 CD를 빌리는 경우입니다.
		checkOut(arr0,"수지","2022-06-02");
		checkOut(arr1,"수지","2022-06-02");
		checkOut(arr2,"수지","2022-06-02");
	}
	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나
	//필드의 존재 여부를 체크하기 때문에
	//Lendable 인터페이스에 checkOut 메소드가 있어야 컴파일 에러가 없습니다.
	private static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
