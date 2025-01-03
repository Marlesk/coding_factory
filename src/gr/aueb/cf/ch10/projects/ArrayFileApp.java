package gr.aueb.cf.ch10.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Project 03
 */
public class ArrayFileApp {

    public static void main(String[] args) {
        String fp = "C:/Users/maria/Desktop/projects-java/text.txt";
        int[][] arr = new int[128][2];
        int character;

        for (int i = 0; i < 128; i++) {
            arr[i][1] = 0;
        }

        try(BufferedReader bf = new BufferedReader(new FileReader(fp))){
            while((character = bf.read()) != -1) {
                if (Character.isWhitespace(character)) {
                    continue;
                }

                if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
                    arr[character][0] = character;
                    arr[character][1]++;
                }
            }

            //Ταξινόμηση ανά χαρακτήρα εμφάνισης
            sortCharArray(arr);

            System.out.println();

            //Ταξινόμηση ανά συχνότητα εμφάνισης
            sortFreqArray(arr);


        } catch (IOException e) {
            System.out.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
        }
    }

    public static void sortCharArray(int[][] arr) {
        System.out.println("Ταξινόμηση ανά χαρακτήρα εμφάνισης");

        for (int i = 65; i <= 122; i++) {
            if (arr[i][1] > 0) {
                System.out.println("Χαρακτηρας: " + (char) arr[i][0] + " Συχνότητα: " + arr[i][1]);
            }
        }
    }

    public static void sortFreqArray(int[][] arr) {
        int min = 0;
        int value = 0;

        for (int i = 65; i < 122; i++) {
            for (int j = i + 1; j <= 122; j++) {
                if (arr[i][1] < arr[j][1]) {
                    min = arr[j][1];
                    value = arr[j][0];
                    arr[j][1] = arr[i][1];
                    arr[j][0] = arr[i][0];
                    arr[i][1] = min;
                    arr[i][0] = value;
                }
            }
        }

        System.out.println("Ταξινόμηση ανά συχνότητα εμφάνισης");
        for (int i = 65; i <= 122; i++) {
            if (arr[i][1] > 0) {
                System.out.println("Χαρακτηρας: " + (char) arr[i][0] + " Συχνότητα: " + arr[i][1]);
            }
        }
    }
}



