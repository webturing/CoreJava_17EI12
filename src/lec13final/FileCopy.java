package lec13final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("A.txt");
			FileWriter fw= new FileWriter("B.txt");
			int x;
			while ((x = fr.read()) != -1) {
				fw.write(x);
			}
			
			fr.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("File not found!");
		}

	}

}
