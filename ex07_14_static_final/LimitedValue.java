package ex07_14_static_final;

//��� �ʵ� ������ �����ϴ� Ŭ����
class LimitedValue {
	// final�� static ��ġ �ٲ� �˴ϴ�
	// final static in UPPER_LIMMIT = 100000;// ��� �ʵ��� ����
	static final int UPPER_LIMMIT = 100000;// ��� �ʵ��� ����
	int value;

	void setValue(int value) {
		if (value < UPPER_LIMMIT)
			this.value = value;

		else
			this.value = UPPER_LIMMIT;// ��� �ʵ��� ���
	}
}
