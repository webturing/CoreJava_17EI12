package lec13final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,2};
		try{
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			a=new int[3];
			System.out.println(a[2]);
		}
		

	}

}
