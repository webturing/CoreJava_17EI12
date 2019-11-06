package lec13final;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileApp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String group = "17EI123";

		File file = new File("17EI123");
		String[] list=file.list();
		for(String sfile:list){
			File subfolder=new File(file,sfile);
			System.out.println(subfolder.getAbsolutePath());
			if(subfolder.isDirectory()){
				String[] sublist=subfolder.list();
				for(String ssfile:sublist){
					System.out.println(ssfile);
				}
			}
		}
		

	}

}
