package lec13final;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AddFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = null;
		try {
			cin = new Scanner(new FileReader("test.in"));
		} catch (FileNotFoundException e) {
			cin = new Scanner(System.in);
		}
		int n = cin.nextInt();
		while (cin.hasNext() && n-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(a + b);

		}
		cin.close();

	}

}
