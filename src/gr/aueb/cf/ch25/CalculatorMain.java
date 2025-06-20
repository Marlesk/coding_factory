package gr.aueb.cf.ch25;

public class CalculatorMain {

    public static void main(String[] args) {
        testAdd();
        testSub();
    }

    public static void testAdd() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;
        int actualResult = calculator.add(a,b);

        System.out.println(actualResult == expectedResult ? "Passed" : "Failed");
    }

    public static void testSub() {
        Calculator calculator = new Calculator();
        int a = 30;
        int b = 20;
        int expectedResult = 10;
        int actualResult = calculator.sub(a,b);

        System.out.println(actualResult == expectedResult ? "Passed" : "Failed");
    }
}
