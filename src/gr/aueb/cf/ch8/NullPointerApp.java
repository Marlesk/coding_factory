package gr.aueb.cf.ch8;

public class NullPointerApp {

    public static void main(String[] args) {
        String s;
        int secret = 11;

        s = getBravoOrNull(secret);

        if (s == null) {
            System.out.println("Not Lucky");
            return;
        }

        if (s.equals("Bravo")) {
            System.out.println("Very Lucky");
            return;
        }

        System.out.println("Indiferrence");

    }

    public static String getBravoOrNull(int secret) {
        final int SECRET = 12;

        if (secret != SECRET) return null;
        return "Bravo";
    }
}
