package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DoMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Επίλεξε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();
        } while (choice !=3);

        System.out.println("Thanks for using");
    }

}
