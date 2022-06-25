package ex13_4;

public class ObjectExample {
	public static void main (String args[]) {
		GoodsStock obj = new GoodsStock("73527",200);
		String str = "재고정보 = "+ obj;
		//문자열과 GoodsStock 객체 변수를 + 연산자로 연결하면
		//그 객체의 toString 메소드가 자동으로 호출된 후 문자열이 연결됩니다.
		//String str = "재고정보 = "+obj.toString()
		System.out.println(str);
	}
}
