package ex13_8_clone_참고1_deep;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle (Point p, double r){
		this.p=p;
		this.r=r;
	}
	
	public Circle clone(){  
		  try{
			  Circle c = (Circle)super.clone();
		      c.p = new Point(this.p.x, this.p.y);    
			  return c;
		  }catch(CloneNotSupportedException e){ 
			  System.out.println("복사중 오류 입니다.");
			  return null;
		  }
	  }

	
	public String toString() {
		return "[p="+ p + ", r=" + r + "]";
	}
}
