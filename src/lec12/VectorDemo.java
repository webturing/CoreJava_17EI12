package lec12;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.size());
		for(int i=0;i<10;i++){
			v.add(i);
			System.out.println(v);
		}
		System.out.println(v.contains(3));
		Collections.sort(v);
		Collections.shuffle(v);
		
	}

}
