package gr.aueb.cf.ch14;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return str.equals(reversed.reverse().toString());
    }
}
