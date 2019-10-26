package lec12;

import java.util.Arrays;
import java.util.TreeMap;

public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String[] words="To know everything is to know nothing".toLowerCase().split("\\s+");
	System.out.println(Arrays.toString(words));
	TreeMap<String,Integer> map=new TreeMap<String,Integer>();
	for(String word:words){
		if(map.containsKey(word)){
			int old=map.get(word);
			map.put(word, old+1);
		}else{
			map.put(word, 1);
		}
	}
	for(String word:map.keySet()){
		System.out.println(word+":"+map.get(word));
	}

	}

}
