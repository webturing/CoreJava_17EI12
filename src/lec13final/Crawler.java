package lec13final;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Crawler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.ahstu.edu.cn/");
			Scanner cin=new Scanner(new BufferedInputStream(url.openStream()));
			while(cin.hasNextLine()){
				String line=cin.nextLine();
				System.out.println(line);
			}
			cin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
