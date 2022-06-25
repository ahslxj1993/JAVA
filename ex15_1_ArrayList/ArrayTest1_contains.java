package ex15_1_ArrayList;
/*
 * ArrayList에 있는 데이터 검색하는 예
 * -indexOf(data) : 인자와 같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴
 * -lastIndexOf(data): 인자와 같은 값을 마지막부터 순서대로 데이터를 찾아서 그 위치의 인덱스를 리턴
 * - 인자와 같은 값이 없으면 -1을 리턴
 * */


import java.util.ArrayList;

public class ArrayTest1_contains {
	public static void main (String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("봄");
		list1.add("여름");
		
		if (list1.contains("봄")) {
			System.out.println("봄이 존재합니다");
		} else {
			System.out.println("봄이 존재하지 않습니다.");
		}
	}
}
