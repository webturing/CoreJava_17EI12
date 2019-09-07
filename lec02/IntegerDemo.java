
public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(1023));
		System.out.println(Integer.toString(97, 16));
		String s="113";
		System.out.println(Integer.parseInt(s,2));
		System.out.println(Integer.parseInt(s,16));//256+16+1
	}

}
