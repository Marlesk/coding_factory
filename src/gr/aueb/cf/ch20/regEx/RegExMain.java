package gr.aueb.cf.ch20.regEx;

public class RegExMain {

    public static void main(String[] args) {
        String s1 = "red";
        System.out.println(isRed(s1));
        String s2 = "Green";
        System.out.println(isRedOrGreen(s2));
        String s3 = "ving";
        System.out.println(beginsWithOneUpperCaseAndEndsIng(s3));
        String s4 = " 9";
        System.out.println(whiteSpaceDigit(s4));
        String s5 = "*9";
        System.out.println(anySymbolDigit(s5));
        String s6 = "**";
        System.out.println(anySymbolDigit(s6));
        String s7 = "@aueb@";
        System.out.println(isEmai(s7));
        String s8 = "15/04/2015";
        System.out.println(isDate(s8));
        String s9 = "Athens Uni       of      Eco";
        String[] tokens = doSplit(s9);
        for (String token : tokens) {
            System.out.println(token + "");
        }
        System.out.println(doReplace(s9));
        String s10 = "Maria Leska";
        System.out.println(doReplaceBackReference(s10));


    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]red|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[a-zA-z]ing");
    }

    public static boolean whiteSpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s) {
        return s.matches(".\\d");
    }

    public static boolean isEmai(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}\\d{2}\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s","&");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s(.+)","$2 $1");
    }
}
