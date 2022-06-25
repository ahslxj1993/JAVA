package ex13_4;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	public String toString() {
		return "상품코드:"+goodsCode+" 상품수량:"+stockNum;
	}
}
