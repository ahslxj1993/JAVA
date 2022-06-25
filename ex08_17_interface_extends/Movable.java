package ex08_17_interface_extends;

interface Movable {
	//절대 위치로 이동한다
	void moveTo(int x, int y);
	
	//상대 위치로 이동한다
	void moveBy(int xOffset, int yOffset);
}
