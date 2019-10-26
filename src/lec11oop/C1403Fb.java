import java.util.Scanner;
import java.util.TreeSet;

public class C1403Fb {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			TreeSet<Rectangle> S=new TreeSet<Rectangle>();
			for (int i = 0; i < n; i++) {
				S.add( new Rectangle(cin.nextInt(), cin.nextInt(),cin.nextInt()));
			}
			for(Rectangle s:S)
				System.out.println(s);			
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
