package ex13_3_Object_to_String_override;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		return "��ǰ�ڵ�:"+goodsCode+" ������:"+stockNum;
	}
}
