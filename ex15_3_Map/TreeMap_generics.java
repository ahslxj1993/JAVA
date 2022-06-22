package ex15_3_Map;
import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 *	키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다.
 *	검색과 정렬에 적합한 컬렉션 클래스입니다.
 * */


public class TreeMap_generics {
	public static void main(String[] args) {
		//HashMap객체생성 방법 두가지
		//방법1. 업캐스팅
		//Map <String,String > tm = new TreeMap<String,String>();      
		
		//방법2. 구현 클래스를 통한 객체생성
		TreeMap<String, String> tm = new TreeMap<String,String>();
		
		//Key와 Value 쌍을 삽입
		//Map의 put()을 이용해 (Key, Value) 쌍으로 자료 저장합니다.
		tm.put("woman", "재미있니");
		tm.put("man", "좋은하루");
		tm.put("age", new String("10"));
		tm.put("city","Seoul");
		tm.put("city","Busan");
		
		//출력방법 1. 해당 객체명으로 출력
		System.out.println(tm);
		//{woman = 재미있니, city=Seoul, man=좋은하루,age=10}
		
		//출력방법2. key값만 출력
		
		System.out.println(tm.keySet());
		//출력방법3. value 값만 출력
		System.out.println(tm.values());
		//출력방법4.
		//get(key): key 에 해당하는 value를 출력 - 가장 많이 사용
		System.out.println(tm.get("woman"));//재미있니
		System.out.println(tm.get("city"));//Busan
		
		//출력방법5.
		System.out.println("=======================");
		Set<String> keys = tm.keySet();
		for (String key: keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}
	
}
