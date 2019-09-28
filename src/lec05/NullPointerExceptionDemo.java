package lec05;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int[] a = null;
      //  System.out.println(a.length);
        int[] b = {1, 3,};
        a = b;
        a = new int[4];
        System.out.println(a.length);
    }
}
