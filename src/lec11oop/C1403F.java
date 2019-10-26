import java.util.Arrays;
import java.util.Scanner;

public class C1403F {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			Rectangle[] rects = new Rectangle[n];
			for (int i = 0; i < n; i++) {
				rects[i] = new Rectangle(cin.nextInt(), cin.nextInt(),
						cin.nextInt());
			}
			Arrays.sort(rects);
			System.out.println(rects[0]);
			for (int i = 1; i < n; i++) {
				if (rects[i].compareTo(rects[i - 1])== 0)
					continue;
				System.out.println(rects[i]);
			}
		}
		cin.close();
	}

	static class Rectangle implements Comparable<Rectangle> {
		int len, wid, num;// len>=wid

		public Rectangle(int num, int len, int wid) {
			super();
			this.len = Math.max(len, wid);
			this.wid = Math.min(len, wid);
			this.num = num;
		}

		@Override
		public String toString() {
			return String.format("%d %d %d", num, len, wid);
		}

		@Override
		public int compareTo(Rectangle that) {
			if (this.num != that.num)
				return this.num - that.num;// order by num asc
			if (this.len != that.len)
				return this.len - that.len;

			return this.wid - that.wid;
		}

	}

}
