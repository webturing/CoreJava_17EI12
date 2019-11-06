package lec12review;
import java.util.Stack;


public class StackApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=6;
		Stack<Integer> S=new Stack<Integer>();
		while(n>0){
			int d=n%2;
			S.add(d);
			n/=2;
		}
		while(!S.empty()){
			System.out.println(S.peek());
			S.pop();
		}

	}

}
