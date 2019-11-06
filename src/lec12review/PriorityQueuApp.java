package lec12review;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueuApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=cin.nextInt();

		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		int cost = 0;
		for (Integer i : a)
			PQ.offer(i);

		while (PQ.size() > 1) {
			int x = PQ.peek();
			PQ.poll();
			int y = PQ.peek();
			PQ.poll();
			int z = x + y;
			cost += z;
			PQ.offer(z);

		}
		System.out.println(cost);

	}
	static Scanner cin=new Scanner(System.in);
}
