package lec13final;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		try {
			BufferedReader br=new BufferedReader(new FileReader("Snippet.java"));
			while(true){
				String s=br.readLine();
				if(s==null)break;
				if(s.trim().isEmpty())continue;
				++count;
				//System.out.println(s);
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}
	

}
