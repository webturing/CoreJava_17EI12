package lec12review;
import java.util.Arrays;
import java.util.Stack;


public class StackApp2 {

	/**
	 *  1 2 + 3 4 + *
	 */
	public static void main(String[] args) {
		//System.out.println("+123.456".matches("\\d+"));
		String [] exp="1 2 + 3 4 + *".split("\\s+");
		System.out.println(Arrays.toString(exp));
		Stack<Double> S=new Stack<Double>();
		for(String s:exp){
			if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){//operator
				double b=S.peek();
				S.pop();
				double a=S.peek();
				S.pop();
				double c=0;
				if(s.equals("+")){
					c=a+b;
				}else if(s.equals("*")){
					c=a*b;
				}
				S.push(c);
				
			}else{//operand
				S.push(Double.parseDouble(s));
			}
			
		}
		System.out.println(S.peek());
	}

}
