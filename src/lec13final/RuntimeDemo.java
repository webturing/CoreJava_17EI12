package lec13final;

import java.io.IOException;

public class RuntimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		for(int i=0;i<10;i++){
			if (Math.random() < 0.5)
				Runtime.getRuntime().exec("calc.exe");
			else
				Runtime.getRuntime().exec("notepad.exe");
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
