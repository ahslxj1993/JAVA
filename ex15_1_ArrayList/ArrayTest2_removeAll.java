package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest2_removeAll {
	public static void main (String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("º½");
		list1.add("¿©¸§");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("º½");
		list2.add("º½");
		list2.add("¿©¸§");
		list2.add("°¡À»");
		list2.add("°Ü¿ï");
		
		
		list2.removeAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
