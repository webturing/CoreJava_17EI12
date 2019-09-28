package lec05;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int []a={1,3,5,7,9,2,4,6,8,0};
        Arrays.sort(a,5,10);//[a,b)
       // System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,10);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0,5,5);
        System.out.println(Arrays.toString(a));
    }
}
