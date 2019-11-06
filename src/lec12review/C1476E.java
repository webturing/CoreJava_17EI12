package lec12review;
import java.util.Arrays;


public class C1476E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=11;
		int a[]=new int[10];
		for(int p=1;p<=n;p++){
			int q=p;
			while(q>0){
				int d=q%10;
				q/=10;
				++a[d];
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
