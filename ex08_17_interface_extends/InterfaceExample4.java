package ex08_17_interface_extends;

public class InterfaceExample4 {
	public static void main(String args[]) {
        Rectangle obj = new Rectangle(100, 200, 10, 10); 
        printRectangle(obj);
        
        obj.moveTo(25, 35);            
        printRectangle(obj);
        
        obj.moveBy(-5, -5);           
        printRectangle(obj);
        
        obj.resize(30, 30);           
        printRectangle(obj);
    }

	private static void printRectangle(Rectangle obj) {
		//System.out.println("�簢�� : ��ġ("+obj.x+", "+obj.y+") ũ�� ("+obj.width+"x"+obj.height+")");
		System.out.printf("�簢�� : ��ġ(%3d, %3d) ũ�� (%3d X%3d) %n",
				obj.x, obj.y, obj.width, obj.height);
	}
}
