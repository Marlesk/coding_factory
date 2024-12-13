package gr.aueb.cf.ch5;

public class AddApp {

    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int sum = 0;
       sum = add(a,b);

        System.out.println("Sum = "+ sum);
    }


    /**
     * Add two integers
     * @param a    the first int to add
     * @param b    the second int to add
     * @return     the sum of a and b
     */

    public static int add(int a, int b) {
        return a+b;
    }
}
