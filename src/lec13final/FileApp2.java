package lec13final;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String group = "17EI123";
		String students[] = "27001 27002 27003".split("\\s+");
		String filename = "hello.txt";
		String messge = "hello";

		File file = new File("17EI123");
		if (!file.exists()) {
			file.mkdir();
		}
		// group directory created
		for (String student : students) {
			File subfile = new File(file, student);
			subfile.mkdir();
			try {
				PrintWriter pw = new PrintWriter(new FileWriter(new File(
						subfile, filename),true));
				
				pw.println(messge+" "+student+" !");
				pw.close();
			} catch (Exception e) {

			}
		}

	}

}
