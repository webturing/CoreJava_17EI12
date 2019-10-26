import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C1401A {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a, new Comparator<Integer>() {

				@Override
				public int compare(Integer arg0, Integer arg1) {
					// TODO Auto-generated method stub
					return Math.abs(arg1) - Math.abs(arg0);
				}

			});
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
