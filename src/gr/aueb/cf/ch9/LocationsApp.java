package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class LocationsApp {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String line;
        String[] tokens;

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/Users/maria/Desktop/test/locations.txt"));
            PrintStream ps = new PrintStream("C:/Users/maria/Desktop/test/newlocations.txt");) {
            // Παράλειψη της πρώτης γραμμής (επικεφαλίδες)
            line = bf.readLine();

            while ((line = bf.readLine()) != null) {
                tokens = line.split(",+\\s*");
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("location: '%s', latitide: %s, longitude: %s \n", tokens[0],tokens[1],tokens[2]);
    }

}



