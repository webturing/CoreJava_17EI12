package lec12;

import java.util.Arrays;

public class A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a=new int[]{1,1,6,3,3};
		Arrays.sort(a);
//		for(int i:a)System.out.println(i);
		System.out.println(a[0]);
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1])continue;
			System.out.println(a[i]);
		}
	}

}
