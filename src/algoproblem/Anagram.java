package q6anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        /**
         * Take two String
         */
        String x = "abcd";
        String y = "dcba";
        String z = "cbda";
        /**
         * Replace string
         */
        x = x.replace(" ", " ");//java language string function
        y = y.replace(" ", " ");
        z = z.replace(" ", " ");

        /**
         * Convert the string to lover case
         */
        x = x.toLowerCase();
        y = y.toLowerCase();
        z = z.toLowerCase();

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        char c[] = z.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        Boolean result = Arrays.equals(a, b);


        if(result == true) {
            System.out.println("Strings are Anagram");
        }

        else {
            System.out.println("Strings are not Anagram");
        }
    }
}
