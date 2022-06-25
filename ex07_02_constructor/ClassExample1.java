package ex07_02_constructor;

public class ClassExample1 {
	public static void main(String [] args) {
		GoodsStock obj;
		obj = new GoodsStock("52135",200);
		
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("-----------obj.addStock(1000) 후 ---------");
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
		
		obj.subtrackStock(500);
		System.out.println("-----------obj.substrackStock(500)후 ------------");
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고수량 : "+obj.stockNum);
	}
}
