package lec12review;
import java.util.PriorityQueue;

public class PriorityQueuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		int a[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
		for (Integer i : a) {
			PQ.offer(i);
		}
		while (!PQ.isEmpty()) {
			System.out.println(PQ.peek());//
			PQ.poll();
		}

	}

}
