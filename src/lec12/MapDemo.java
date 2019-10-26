package lec12;

import java.util.TreeMap;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String,String>contacts=new TreeMap<String,String>();
		System.out.println(contacts);
		contacts.put("tom", "123456");
		System.out.println(contacts);
		contacts.put("jerry", "987654");
		System.out.println(contacts);
		contacts.put("zj", "13625500036");
		System.out.println(contacts);
		System.out.println("Callling "+contacts.get("zj"));
		contacts.put("zj","0000");
		System.out.println(contacts);
		contacts.remove("jerry");
		System.out.println(contacts);
		for(String name:contacts.keySet())
			System.out.println(name+" "+contacts.get(name));
		System.out.println(contacts.containsKey("jerry"));

	}

}
