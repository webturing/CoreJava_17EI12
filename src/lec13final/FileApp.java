package lec13final;

import java.io.File;

public class FileApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("A1.txt");
		System.out.println(file.exists());//false
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());


	}

}
