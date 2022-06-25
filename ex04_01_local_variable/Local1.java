package ex04_01_local_variable;
// main(String[] arg)와 main(Sring arg[])의 차이점은?

//local variable -method 안에 정의된 변수
public class Local1 {
	public static void main(String[] v)/*arg 자리에 뭔짓을 해도 괜찮다. 중요한건 String*/ {
		int num; //local variable 
		num = 10 + 20;
		System.out.println(num);
	}
}
