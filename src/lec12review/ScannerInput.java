package lec12review;
import java.util.Scanner;


public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int T=Integer.valueOf(cin.nextLine());
		while(T-->0){
			String s=cin.nextLine();
			System.out.println(s);
			
		}
		cin.close();

	}

}
