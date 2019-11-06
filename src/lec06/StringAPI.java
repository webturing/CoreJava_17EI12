package lec06;

public class StringAPI {
    /**
     * \d=[0-9] (0|1|2|3...|9)
     * [a-z]
     * [A-Z]
     * d s w
     * @param args
     */
    public static void main(String[] args) {
        String s = "0123456789abAdef123ghijklmnopqr121212stuvWxy18238919802390";

        System.out.println(s.length());
        System.out.println(s.substring(10));
        System.out.println(s.substring(10,15));//[begin,end)
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('8','z'));
        System.out.println("we think we can".replaceAll("we",""));
        System.out.println(s.indexOf('8'));
        System.out.println(s.indexOf("89x"));

    }
}
