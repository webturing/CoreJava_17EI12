package lec12review;
import java.util.Stack;


public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer>  S=new Stack<Integer>();
		for(int i=0;i<10;i++){
			S.push(i);
			System.out.println(S);
		}
		while(!S.empty()){
			System.out.println(S.peek()+" out!!");
			S.pop();
		}

	}

}
