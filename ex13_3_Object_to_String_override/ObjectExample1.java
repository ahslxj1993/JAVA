package ex13_3_Object_to_String_override;

class ObjectExample1 {
	public static void main (String args[]) {
		GoodsStock obj = new GoodsStock("73527",200);
		String str = obj.toString();
		System.out.println(str);
	}
}
