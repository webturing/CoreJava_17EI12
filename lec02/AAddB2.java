import java.util.Scanner;


public class AAddB2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){//Ctrl+Z EOF
			int a=cin.nextInt();
			int b=cin.nextInt();
			System.out.println(a+b);
		}

	}

}
