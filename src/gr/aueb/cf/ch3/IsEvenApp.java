package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IsEvenApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNump = 0;
        boolean IsEven = false;

        System.out.println("Give a number");
        inputNump = in.nextInt();

        IsEven = (inputNump % 2 == 0);

        System.out.printf("Is Even the %d? %b", inputNump,IsEven);

    }
}
