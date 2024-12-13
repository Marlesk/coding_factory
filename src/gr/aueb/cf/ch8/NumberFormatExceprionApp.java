package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceprionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;
        String str = "";

//        try {
//            System.out.println("Insert a number");
//            str = in.nextLine();
//            numb = Integer.parseInt(str);
//            System.out.println("Input number:" + numb);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }

        System.out.println("Insert a number");
        str = in.nextLine();
        if (isInt(str)) {
            numb = Integer.parseInt(str);
            System.out.println("Input number:" + numb);
        } else {
            System.out.println("Error in parsing. Insert an integer");
        }
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
