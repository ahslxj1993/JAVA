//메서드를 이용한 배열출력
package ex06_02_method;

public class MethodExample2 {
	public static void main (String [] args) {
		int [] num = {1,2,3,4,5};
		print(num);
		return;
	}

	public static void print(int [] p_num) {
		for(int i =0 ; i<p_num.length ; i++) {
			System.out.print(p_num[i]+" ");
		}
	
		System.out.println();	//줄바꿈
		//향상된 for문
		for (int i  : p_num) {
			System.out.print(i+" ");
			}
		return;
		}
	}
