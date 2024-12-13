package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        Scanner in = new Scanner(System.in);
        int i = 1;
        int result = 1;


        System.out.println("Give a base and power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power){
            result *= base;
            i++;
        }
        System.out.printf("%d^%d = %d", base,power,result );
    }
}
