package gr.aueb.cf.ch5;

public class DivisionApp {

    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result = 0.0;
        double remaining = 0.0;

        result = num1 / num2;
        remaining = num1 % num2;

        System.out.println(result);
        System.out.println(remaining);
    }

}
