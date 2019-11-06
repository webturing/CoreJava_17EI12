package lec13final;

import java.io.IOException;

public class RuntimeDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				Runtime.getRuntime().exec("explorer.exe https://oj.ahstu.cc");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
