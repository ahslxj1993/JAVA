package ex11_3_StringTokenizer;

import java.util.StringTokenizer;
//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� �����մϴ�.
public class StringTokenizerExample4 {
	public static void main(String args[]) {
		//true : �����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok
		= new StringTokenizer("���=10|���ݷ�=3|������=1","=|",true);
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}//main end
	
}
