package ex03_1_literal;

public class Literal2_print {
	public static void main(String args[]) {
		System.out.println("호호하하");
		System.out.println("\"호호하하\"");
		System.out.println("호호\n하하\n");
		System.out.println("호호하하%n");
		System.out.println("호호\t하하");
		System.out.println("호호\\하하");
		System.out.println();
		
		System.out.printf("%f",42.195);
		System.out.println();
		System.out.printf("%.2f%n",42.195);
		System.out.printf("%d\n",42);
		System.out.printf("%10d\n",42);
		System.out.printf("%c%n",'A');
		System.out.printf("%s%n","홍길동");
		System.out.printf("%10s\n","홍길동");
		System.out.printf("\n나의 이름은 %s, 나의 나이는 %d세 입니다.","홍길동",21);
	}

}
