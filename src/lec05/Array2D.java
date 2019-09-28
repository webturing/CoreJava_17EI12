package lec05;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][]a=new int[3][4];
       // for(int i=0;i<a.length;i++)
        //System.out.println(Arrays.toString(a[i]));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        a[2][3]=5;
        int [][]b=new int[3][];
        b[0]=new int[2];
        b[1]=new int[4];
        b[2]=new int[3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
