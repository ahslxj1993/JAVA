package ex19_02_Serialization_interface;
class GoodsStock implements java.io.Serializable {   // ��� ���� Ŭ����
	
	private static final long serialVersionUID = 1L;
	
	//private static final long serialVersionUID = 1431520878727342162L;
	
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
            throw new Exception("��� �����մϴ�.");
        this.num -= num;            
        return num;
    }
    
    public String toString() {
    	return "��ǰ�ڵ�:" + code + "\t��ǰ����:" + num;
    }
    
}
