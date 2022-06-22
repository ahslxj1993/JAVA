package ex15_1_ArrayList;
/*
 * ArrayList에 있는 데이터 검색하는 예
 * -indexOf(data) : 인자와 같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴
 * -lastIndexOf(data): 인자와 같은 값을 마지막부터 순서대로 데이터를 찾아서 그 위치의 인덱스를 리턴
 * - 인자와 같은 값이 없으면 -1을 리턴
 * */


import java.util.ArrayList;

public class ArrayTest1_contains2 {
	public static void main (String args[]) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("봄");
		list2.add("봄");
		list2.add("가을");
		list2.add("겨울");

		//list2에서 list1과 공통되는 요소들을 찾아서 삭제
		for (int i=0; i<list2.size();i++) {
			//지정된 객체(list2.get(i))가 list1에 포함되어 있는지 확인
			if(list1.contains(list2.get(i)))
				list2.remove(i--);
				//list2.remove(i);
				//i--;
		}
		
		/*뒤에서부터 찾기
		for (int i=list2.size()-1; i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		*/
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
