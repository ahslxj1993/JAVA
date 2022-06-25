package ex15_3_Queue;
/*
 * 큐(Queue) 인터페이스
 * -LinkedList(Queue 인터페이스를 구현한 클래스)를 사용
 * -FIFO(Fisrt Input First Output) 구조
 * 			먼저 입력된 자료가 먼저 출력되는 구조
 * */
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main (String [] args) {
		//큐로 사용할 LinkedList 객체를 생성합니다
		//LinkedList<String> queue = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("비었나요? "+queue.isEmpty()); // true - 비었는지 판단
		
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		//peek() 메소드 - 처음 데이터를 그대로 둔 상태로 가져옵니다.
		System.out.println(queue.peek());
		System.out.println("비었나요? "+queue.isEmpty());
		System.out.println("갯수 : "+queue.size());// true - 비었는지 판단
		
		System.out.println("poll() 사용");
		while(!queue.isEmpty()) {
		//poll() 메소드는 큐에있는 데이터를 제거하면서 가져옵니다
		String str = queue.poll();
		System.out.println(str);
		}
		System.out.println("비었나요? "+queue.isEmpty());
	}
}
