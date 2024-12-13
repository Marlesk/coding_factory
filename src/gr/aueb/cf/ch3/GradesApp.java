package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει συνολικούς βαθμούς και το πλήθος των μαθημάτων
 * και υπολογίζει τον μέσο όρο βάση του οποίου
 * αν ο μ.ο >=9 Άριστα, μ.ο >=7 Καλώς, μ.ο >=5 Λίαν Καλώς, μ.ο <5 Αποτυχία
 * το πρόγραμμα θα τερματίζει αν ο χρήστης δώσει βαθμολογία <=0
 * ή και πλήθος μαθημάτων <=0 και να βγάζει ανάλογο μήνυμα σε κάθε περίπτωση
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGrades = 0;
        int totalLessons = 0;
        int average = 0;


        System.out.println("Give the totoal grades");
        totalGrades = scanner.nextInt();
        System.out.println("Give the total number of lessons");
        totalLessons = scanner.nextInt();

        if (totalLessons <= 0) {
            System.out.println("Total lessons must not be zero or negative");
            System.exit(1);
        }

        if (totalGrades <= 0) {
            System.out.println("Total grades must not be zero or negative");
            System.exit(1);
        }

        average = totalGrades / totalLessons;

        if (average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent " + average);
        }else if (average>=7) {
            System.out.println("Very Good " + average);
        }else if (average>=5) {
            System.out.println("Good " + average);
        }else{
            System.out.println("Failure " + average);
        }
    }
}
