package gr.aueb.cf.ch14;

public class ValidationUtils {

    private ValidationUtils() {

    }

    public static boolean isLengthBetweenOneToThirtyOne(String str) {
        return !str.isEmpty() && str.length() <= 31;
    }

    public static boolean isBetweenOneToTen(int n) {
        return n >= 1 && n <= 10;
    }
}
