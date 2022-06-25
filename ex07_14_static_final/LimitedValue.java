package ex07_14_static_final;

//상수 필드 선언을 포함하는 클래스
class LimitedValue {
	// final과 static 위치 바뀌어도 됩니다
	// final static in UPPER_LIMMIT = 100000;// 상수 필드의 선언
	static final int UPPER_LIMMIT = 100000;// 상수 필드의 선언
	int value;

	void setValue(int value) {
		if (value < UPPER_LIMMIT)
			this.value = value;

		else
			this.value = UPPER_LIMMIT;// 상수 필드의 사용
	}
}
