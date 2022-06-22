package ex15_1_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayList5_add_set_remove {
	public static void main(String [] args) {
		//ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		//세개의 데이터 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		pArrayList(list);//리스트를 보여주는 메소드
		
		//리스트에 두개의 데이터 삽입
		list.add(2,"키위");
		list.add(4,"키위");
		pArrayList(list);
		//인덱스 0 에 위치한 데이터를 오렌지로 바꿈
		list.set(0, "오렌지");
		pArrayList(list);
		//인덱스 1 위치에 있는 데이터를 삭제
		list.remove(1);
		pArrayList(list);
		//리스트에서 키위라는 데이터를 찾아서 삭제
		list.remove("키위");
		pArrayList(list);
	}

	private static void pArrayList(ArrayList<String> list) {
		int num = list.size();
		for (int cnt =0;cnt<num;cnt++) {
			String str = list.get(cnt);
			System.out.println("index ="+cnt+"\t데이터 ="+str);
		}
		System.out.println("===========================");
	}
		
}
