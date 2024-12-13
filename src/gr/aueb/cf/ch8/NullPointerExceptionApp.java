package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        // String s = null; error
        String s = "Coding";

        if (s.equals("AUEB")) System.out.println("AUEB");
    }
}
