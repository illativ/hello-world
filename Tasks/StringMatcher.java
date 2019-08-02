package tests;

public class StringMatcher {

    // !!! TASK:  Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    // So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings. !!!

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }


    public static int stringMatch(String a, String b) {
        int counter = 0;
        int ind = 2;
        int n;

        if (a.length() < b.length()) {
            n = a.length() - 1;
        } else {
            n = b.length() - 1;
        }

        for (int i = 0; i < n; i++) {

            if (a.substring(i, ind).equals(b.substring(i, ind))) {
                counter++;
            }

            ind++;
        }

        return counter;
    }


}
