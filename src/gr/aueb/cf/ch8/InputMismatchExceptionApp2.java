package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMismatchExceptionApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;
        final int MAGIC = 12;

        while (true) {
                System.out.println("Insert a number");

                if (in.hasNextInt()) {
                    numb = in.nextInt();
                } else {
                    System.out.println("Insert a valid int");
                    in.nextLine();
                    continue;
                }
                if (numb == MAGIC) break;
                System.out.println("Input number:" + numb);
        }

    }
}
