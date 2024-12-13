package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros;
        int e500, e100, e50, e20, e10, e5;
        int remanainEuros;

        System.out.println("Give a number of Euros");
        inputEuros = in.nextInt();
        remanainEuros = inputEuros;

        e500 = remanainEuros / 500;
        remanainEuros = remanainEuros % 500;

        e100 = remanainEuros / 100;
        remanainEuros = remanainEuros % 100;

        e50 = remanainEuros / 50;
        remanainEuros = remanainEuros % 50;

        e20 = remanainEuros / 20;
        remanainEuros = remanainEuros % 20;

        e10 = remanainEuros / 10;
        remanainEuros = remanainEuros % 10;

        e5 = remanainEuros / 5;
        remanainEuros = remanainEuros % 5;

        System.out.printf("%d: %d euros500, %d euros100, %d euros50 %d euros20, %d euros10, %d euros5, %d", inputEuros, e500,e100,e50,e50,e20,e10,e5,remanainEuros);
    }
}
