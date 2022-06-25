package ex11_8_Random;

import java.util.Random;

public class RandomExample1 {
	public static void main(String [] args) {
		Random random = new Random();//파라미터 없는 생성자
		
		//0부터 100미만인 정수형 난수 빌생 - 즉 0 부터 99 까지의 정수형 난수 발생
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		
		//1부터 45까지의 난수 발생
		
		System.out.println(random.nextInt(45)+1);
		
		for (int i=0;i<6;i++) {
			System.out.print((random.nextInt(45)+1)+"\t");
		}
	}
}
