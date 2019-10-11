package lec06;

import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            String s = cin.next();
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            char m = cs[cs.length - 1];
            System.out.println(s.replaceAll(m + "", m + "(max)"));
        }
    }
}
