package ex13_4;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		return "��ǰ�ڵ�:"+goodsCode+" ��ǰ����:"+stockNum;
	}
}