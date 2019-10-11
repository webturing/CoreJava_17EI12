package lec06;

import java.util.Scanner;

public class Hex2Bin {
    static String HEX = "0123456789ABCDEF";

    public static void main(String[] args) {

        String s = "C6";
        for (char c : s.toCharArray()) {
            //System.out.println(HEX.indexOf(c));
            int idx2=Integer.parseInt(c+"",16);
            int idx = HEX.indexOf(c)+16;
            String b = Integer.toBinaryString(idx);
//            while (b.length() < 4) {
//                b = "0" + b;
//            }
            System.out.print(b.substring(1));
        }

    }

    static Scanner cin = new Scanner(System.in);
}
