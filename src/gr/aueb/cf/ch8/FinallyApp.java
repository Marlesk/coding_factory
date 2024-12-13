package gr.aueb.cf.ch8;

public class FinallyApp {

    public static void main(String[] args) throws Exception {
        int num = 12;
        try {
            if (num == 12) throw new Exception();
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("coding");
        }

        System.out.println("Not always executed");
    }
}
