package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Lights on if it is raining and car is running > 100 or is dark
 */

public class LightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        boolean IsRaining = false;
        boolean IsDark = false;
        boolean IsLightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Give the speed of car and the darkness and rain");
        speed = in.nextInt();
        IsDark = in.nextBoolean();
        IsRaining = in.nextBoolean();

        IsLightsOn = IsRaining && (speed > MAX_SPEED || IsDark);

        System.out.println("Lights on?" + IsLightsOn);
    }
}
