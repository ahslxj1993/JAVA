package ex19_02_Serialization_error;

class GoodsStock {   // 재고 정보 클래스
	private String code;       
	private int num;         
    GoodsStock(String code, int num) {   
        this.code = code;
        this.num = num;
    }
    void addStock(int num) {  
        this.num += num;              
    }
    int subtractStock(int num) throws Exception {  
        if (this.num < num)
            throw new Exception("재고가 부족합니다.");
        this.num -= num;            
        return num;
    }
    
    public String toString() {
    	return "상품코드:" + code + "\t상품수량:" + num;
    }
    
}
