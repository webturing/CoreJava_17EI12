package lec06;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println(cin.next().replaceAll("\\W+","").replaceAll("\\d",""));
    }
}
