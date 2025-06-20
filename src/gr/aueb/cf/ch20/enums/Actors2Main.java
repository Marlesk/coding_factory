package gr.aueb.cf.ch20.enums;

public class Actors2Main {
        public static void main(String[] args) {
            // Δημιουργούμε παραδείγματα από τα διάφορα στοιχεία του enum
            Actors2 civilian = Actors2.CIVILIAN;
            Actors2 employee = Actors2.EMPLOYEE;
            Actors2 superAdmin = Actors2.SUPER_ADMIN;

            // Εκτυπώνουμε τον ρόλο για κάθε στοιχείο του enum
            System.out.println("Civilian role: " + civilian.toRole());
            System.out.println("Employee role: " + employee.toRole());
            System.out.println("SuperAdmin role: " + superAdmin.toRole());
        }

}
