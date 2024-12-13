package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file7.txt");     // C:\tmp\file7.txt
        String line; //Θα κρατήσει κάθε γραμμή του αρχείου κατά την ανάγνωσή της.
        String[] tokens; //Θα είναι ένας πίνακας που θα αποθηκεύει τα "κομμάτια" της γραμμής, αφού αυτή χωριστεί (split).

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) { //ελέγχει αν υπάρχει επόμενη γραμμή στο αρχείο
                line = in.nextLine(); //την διαβάζει με τη μέθοδο nextLine(). Κάθε γραμμή αποθηκεύεται στην line
                tokens = line.split("\\s+"); //διαχωρίζει τη γραμμή line σε λέξεις ή "tokens" με βάση τα κενά ή οποιοδήποτε διάστημα (ένα ή περισσότερα διαστήματα). Η έκφραση \\s+ σημαίνει "ένα ή περισσότερα κενά"

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
