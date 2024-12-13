package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int numb = 0;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Insert a number");
            numb = in.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
//       } finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        }
    }
}
