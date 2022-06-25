/*File 클래스 : 파일 관리 기능을 갖는 클래스
 * 디렉토리 관리 기능도 가지고 있습니다.
 * %-25s : 25칸을 왼쪽으로 정렬
 * %1$tF : YYYY-mm-dd 포맷의 날짜
 * %1$tT : HH:MM:SS 포맷
 * */

package ex18_10_File;

import java.io.*;
import java.util.*;

public class FileExample1_0 {
	public static void main(String[] args) {
		//상위 디렉토리 경로명을 가지고 File 객체를 생성합니다.
		File file = new File(".");// 현재 디렉토리(.), 상위디렉토리(..)
		File arr[] = file.listFiles();// 서브 디렉토리와 파일목록을 가져옵니다.

		for (int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();//이름을 리턴
			
			if(arr[cnt].isFile())//파일이면 true 아니면 false
				//arr[cnt].length = 파일의 크기 (바이트)
				System.out.printf("%-25s %7d \t",name, arr[cnt].length());
			else
				System.out.printf("%-25s  <DIR> \t",name);
			//1970년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값을 리턴
			//사람이 이해할수 있는 날짜와 시간으로 변경할 필요가 있습니다.
			long time = arr[cnt].lastModified();//최종 수정일시를 리턴
			//System.out.printf("%d\n",time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis 메소드는 객체가 가지고 있는 시각 정보를 파라미터 값으로 갱신하는 메소드
			//이떄 파라미터는 190년 1월 1일 0시 0분 0초 기점으로 경과한 밀리세컨드 값이어야 합니다.
			calendar.setTimeInMillis(time);
			//1$ : 포맷 문자열 다음에 오는 첫 번째 파라미터 (calendar)
			//%1$tF : YYYY-mm-dd 포맷의 날짜
			//* %1$tT : HH:MM:SS 포맷
			System.out.printf("%1$tF %1$tT \n",calendar);
			//System.out.printf("%tF %tT \n",calendar,calendar);
		}
		

	}
}
