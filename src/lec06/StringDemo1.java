package lec06;

import java.util.Calendar;

public class StringDemo1 {
    public static void main(String[] args) {//#include<ctype.h>
        String s = "0123123123asjkdfjka JLLJSJLKGLJKJKL sdfjkl   &*&*(*&($^%&^&%^&";
        int upper, lower, number, space, other;
        upper = lower = number = space = other = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) ++upper;
            else if (Character.isLowerCase(c)) ++lower;
            else if (Character.isDigit(c)) ++number;
            else if (Character.isSpace(c)) ++space;
            else ++other;
        }
        System.out.println(String.format("%d %d %d %d %d",upper, lower, number, space, other));
    }
}
