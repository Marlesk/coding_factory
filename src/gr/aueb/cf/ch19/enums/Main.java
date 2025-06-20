package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        UserRole roleStudent = UserRole.STUDENT;

        String strRole = roleStudent.name(); //επιστρέφει το όνομα του enum ως String
        System.out.println(strRole);

        UserRole role = UserRole.valueOf(strRole); // μετατροπή String πίσω σε ένα enum στοιχείο αν υπάρχει

    }
}
