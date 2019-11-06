package lec12review;
import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 6, 3, 1, 7, 5, 8, 9, 2, 4 };
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int i : a) {
			Q.offer(i);
		}
		System.out.println(Q);
		while (!Q.isEmpty()) {
			System.out.println(Q.peek());
			Q.poll();
			if (Q.isEmpty())
				break;
			int x = Q.peek();
			Q.poll();
			Q.offer(x);
		}

	}

}
