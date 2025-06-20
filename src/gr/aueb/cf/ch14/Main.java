package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        // exercise 1
//        Logger logger = Logger.getInstance();
//        logger.logMessage("This is a log message");
//        Logger logger1 = Logger.getInstance();
//        logger1.logMessage("This is");

        //exercise 2
//        int[] numbers = null;
//
//        try {
//            System.out.println("Μέγιστο: " + MathHelper.Max(numbers));
//            System.out.println("Ελάχιστο: " + MathHelper.Min(numbers));
//            System.out.println("Μέσος Όρος: " + MathHelper.Average(numbers));
//        } catch (IllegalArgumentException e) {
//            System.err.println("Σφάλμα: " + e.getMessage());
//        }

        //exercise 3

//        String str1 = "madam";
//
//        System.out.println("Reverse: " + StringUtils.reverse(str1));
//        System.out.println("Uppercase: " + StringUtils.upperCase(str1));
//        System.out.println("Is palindrome? " + StringUtils.isPalindrome(str1));

        //exercise 4

        int n = 25;
        String str = "hello";

        System.out.println("Έχει μήκος 1-31 chars? " + ValidationUtils.isLengthBetweenOneToThirtyOne(str));
        System.out.println("Είναι ανάμεσα σε 1 και 10? " + ValidationUtils.isBetweenOneToTen(n));

    }

}

