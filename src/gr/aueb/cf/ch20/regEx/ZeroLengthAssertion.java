package gr.aueb.cf.ch20.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String s = "BCDex";
        //Pattern pattern = Pattern.compile("^.{4,}$");
        Pattern pattern = Pattern.compile("(?=.*?[a-z]).{4,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
