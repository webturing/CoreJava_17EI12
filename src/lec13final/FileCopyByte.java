package lec13final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("A.txt");
			FileOutputStream fw= new FileOutputStream("B.txt",true);
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
