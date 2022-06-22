package ex07_06_constructor_call;

public class SubscriberInfo {
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	
	SubscriberInfo(String name, String id, String password){
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	SubscriberInfo (String name, String id, String password, String phoneNo, String address){
		this(name,id,password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void changePassword (String password) {
		this.password = password;
	}
	
	void setPhoneNo (String new_phoneNo) {
		this.phoneNo=new_phoneNo;
	}
	
	void setAddress (String new_address) {
		address=new_address;
	}
}
