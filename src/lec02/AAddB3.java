package lec02;

import java.util.Scanner;


public class AAddB3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();//2
        //for(int i=0;i<T;i++)
        //for(int i=1;i<=T;i++)
        while (T-- > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }
    }

}
