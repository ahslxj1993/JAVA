package ex07_02_constructor;

public class ClassExample1 {
	public static void main(String [] args) {
		GoodsStock obj;
		obj = new GoodsStock("52135",200);
		
		System.out.println("��ǰ�ڵ� : "+obj.goodsCode);
		System.out.println("������ : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("-----------obj.addStock(1000) �� ---------");
		System.out.println("��ǰ�ڵ� : "+obj.goodsCode);
		System.out.println("������ : "+obj.stockNum);
		
		obj.subtrackStock(500);
		System.out.println("-----------obj.substrackStock(500)�� ------------");
		System.out.println("��ǰ�ڵ� : "+obj.goodsCode);
		System.out.println("������ : "+obj.stockNum);
	}
}
