package lec05;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int []a={1,2,13,23,1,13,12,3,17,12,3,123,123};
        int key=3;
       // Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int pos=Arrays.binarySearch(a,key);
        System.out.println(pos);

    }
}
