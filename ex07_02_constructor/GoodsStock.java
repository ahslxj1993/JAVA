package ex07_02_constructor;

public class GoodsStock {
	//ÇÊµå
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	void addStock(int i) {
		stockNum+= i;
	}

	int subtrackStock (int i2) {
		if (stockNum<i2)
			return 0;
		stockNum-=i2;
		return i2;
	}
}
