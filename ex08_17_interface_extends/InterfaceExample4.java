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
		//System.out.println("사각형 : 위치("+obj.x+", "+obj.y+") 크기 ("+obj.width+"x"+obj.height+")");
		System.out.printf("사각형 : 위치(%3d, %3d) 크기 (%3d X%3d) %n",
				obj.x, obj.y, obj.width, obj.height);
	}
}
