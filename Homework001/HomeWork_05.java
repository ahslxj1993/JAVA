package Homework001;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class HomeWork_05 {
	public static void main (String [] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		Random r= new Random();
		
		while(lotto.size()<6) {
			int num = r.nextInt(45) +1;
			lotto.add(num);
		}
		System.out.println(lotto);
		Iterator<Integer> iterator = lotto.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"\t");
		}
	}
}

