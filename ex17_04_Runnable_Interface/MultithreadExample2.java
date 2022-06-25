//Runnable 인터페이스를 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface;
public class MultithreadExample2 {
	public static void main (String [] args) {
		
		//익명스레드
		//이 클래스에서만 스레드를 사용하고싶을때 사용하면 됩니다
		Thread thread  = new Thread(new Runnable(){

		    public void run() {
		            for (char ch = 'a'; ch <= 'z'; ch++)
		               System.out.print(ch);
		    }
		    
		   });
		
		thread.start();

		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		
		for (char chr : arr)
			System.out.print(chr);
	}
}
