package ex15_4_HashMap.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Method_test05_maxmin {
	static HashMap<String, Integer> max_min(int data[]){
		/*int result[]=new int[2];
		result[0] = data[0];
		result[1] = data[0];*/
		int result [] = {data[0], data[0]};
		
		for(int i=1; i < data.length; i++){
			if(result[0] < data[i]) result[0] = data[i]; //max
			if(result[1] > data[i]) result[1] = data[i]; //min
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("max",result[0]);
		map.put("min",result[1]);
		return map ;		
	}

	public static void main(String args[]) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");
		for(int i=0; i< data.length; i++)
			data[i] = sc.nextInt();
		
		HashMap<String, Integer> result = max_min(data);
	    System.out.println("최댓값 = " + result.get("max"));
	    System.out.println("최솟값 = " + result.get("min"));
	    
	    sc.close();
  }

}
