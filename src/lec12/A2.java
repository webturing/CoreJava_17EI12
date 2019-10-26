package lec12;

import java.util.TreeSet;

public class A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a=new int[]{1,1,6,3,3};
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i:a)set.add(i);
		for(int i:set)System.out.println(i);
	}

}
