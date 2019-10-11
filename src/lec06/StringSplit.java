package lec06;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s = "  To??     know     everything is to know.    nothing.  ";
        s=s.replaceAll("\\W+"," ").toLowerCase().trim();
        String words[]=s.split("\\s+");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
