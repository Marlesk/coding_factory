package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Χιονίζει όταν βρέχει και έχει θερμοκρασία κάτω από το μηδέν
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean IsRaining = false;
        boolean IsSnowing = false;

        System.out.println("Give a temperature and raining");
        temperature = scanner.nextInt();
        IsRaining = scanner.nextBoolean();

        IsSnowing = IsRaining && (temperature > 0);

        System.out.println("Is snowing?" + IsSnowing);

    }
}
