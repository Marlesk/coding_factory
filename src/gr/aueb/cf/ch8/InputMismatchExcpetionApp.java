package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcpetionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;

        while (true) {
            try {
                System.out.println("Insert a number");
                numb = in.nextInt();
                if (numb == 12) break;
                System.out.println("Input number:" + numb);
            } catch (InputMismatchException e) {
                in.nextLine();
                //e.printStackTrace();
                System.out.println("Error in input, insert an integer");
            }
        }



    }

}
