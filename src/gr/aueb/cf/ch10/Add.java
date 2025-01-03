package gr.aueb.cf.ch10;

import java.text.NumberFormat;
import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        while (true) {
            try {
                num1 = getOneNum();
                num2 = getOneNum();
                sum = add(num1 , num2);
                System.out.println("Sum:" + sum);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getOneNum() throws Exception {
        String numStr;
        int num;
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Give a number or # for exit");
            numStr = in.nextLine();

            if(numStr.equals("#")) throw new Exception("User Exit.");
            while (!isInt(numStr)) {
                System.out.println("Please enter a valid integer");
                numStr = in.nextLine();
                if(numStr.equals("#")) throw new Exception("Exit");
            }
            num = Integer.parseInt(numStr);
            return num;
        } catch (Exception e) {
            System.err.println("User Exit");
            throw e;
        }

    }
}
