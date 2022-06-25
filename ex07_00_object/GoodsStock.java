package ex07_00_object;

public class GoodsStock {
	//필드
	String goodsCode;
	int stockNum;
	/*
	 * 1. 생성자
	 * (1) 	인스턴스가 생성 될 때 호출되는 '인스턴스 초기화 메서드' 입니다.
	 * 		따라서 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에
	 * 		실행되어야 할 작업을 위해서도 사용됩니다
	 * (2) 생성자도 오버로딩이 가능하여 여러개의 생성자가 존재 할 수 있습니다.
	 * 
	 * 2.생성자의 조건
	 * (1) 생성자의 이름은 클래스의 이름과 같아야 합니다
	 * (2) 생성자는 리턴 타입이 없습니다
	 */
	
	/* 매개변수가 없는 생성자- 기본생성자
	 * 
	 * (1) 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 합니다
	 * (2) 생성자가 없는 경우 자동으로 추가되는 생성자 입니다
	 * (3) 매개변수가 있는 생성자가 한개라도 작성된 경우에는 기본 생성자는 자동 추가되지 않습니다.
	 * 
	 */
	GoodsStock (){
	}
	//매서드
	void addStock(int i){
		stockNum+= i;
	}
	
	int subtrackStock (int i2) {
		if (stockNum<i2)
			return 0;
		stockNum-=i2;
		return i2;
	}
}
