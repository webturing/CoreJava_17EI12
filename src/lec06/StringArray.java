package lec06;

import java.util.Arrays;
import java.util.Comparator;

public class StringArray {
    public static void main(String[] args) {
        String s = "zero one two three four     five six seven eight nine ten";
        String[] w = s.split("\\s+");
        System.out.println(Arrays.toString(w));


        Arrays.sort(w, new Comparator<String>() {
            @Override
            public int compare(String sa, String sb) {
                //  return sa.compareTo(sb);//字典非降序
                // return sb.compareTo(sa);//字典非升序
                if (sa.length() - sb.length() != 0)
                    return sa.length() - sb.length();//长度升序
                else
                    return sa.compareTo(sb);

            }
        });
        System.out.println(Arrays.toString(w));
    }
}
