import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class C1401F {
	/**
	 * boolean->Boolean
	 * byte->Byte
	 * char->Character
	 * short->Short
	 * int->Integer
	 * long->Long
	 * float->Float
	 * double->Double
	 * Boxing -> Unboxing
	 */
	static Scanner cin=new Scanner(System.in);
	public static void main(String[] args) {
		Integer [] a={1,3,5,7,9,2,4,6,8,0};
		Arrays.sort(a,new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1.compareTo(arg0);
			}			
		});
		System.out.println(Arrays.toString(a));
		}

	

}
