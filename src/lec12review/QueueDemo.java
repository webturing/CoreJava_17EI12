package lec12review;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();// FIFO
		for (int i = 0; i < 10; i++) {
			Q.offer(i);// enqueue
			System.out.println(Q);
		}
		while (!Q.isEmpty()) {
			System.out.println(Q.peek() + " out!!");// front
			Q.poll();// pop

		}

	}

}
