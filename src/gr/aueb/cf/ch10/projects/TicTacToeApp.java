package gr.aueb.cf.ch10.projects;

import java.util.Scanner;

/**
 * Project 04
 */
public class TicTacToeApp {

    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        char player1;
        char player2;
        char symbol;
        boolean isWin = false;
        int turns = 0;

        initialValueArray(arr);

        System.out.println("Παίκτης 1, διάλεξε το σύμβολό σου 'X' ή 'O':");
        player1 = readPlayerSymbol(in);
        if (player1 == 'X') {
            player2 = 'O';
        } else {
            player2 = 'X';
        }

        System.out.println("Ο Παίκτης 1 έχει το σύμβολο: " + player1);
        System.out.println("Ο Παίκτης 2 έχει το σύμβολο: " + player2);
        symbol = player1;

        while (!isWin && turns < 9) {
            System.out.println("Γύρος " + (turns + 1) + ": Παίκτης " + symbol);

            System.out.print("Δώσε έναν αριθμό 0 ή 1 ή 2 για τη γραμμή: ");
            x = getValidInputX(in);
            System.out.print("Δώσε έναν αριθμό 0 ή 1 ή 2 για τη στήλη: ");
            y = getValidInputΥ(in);

            if (arr[x][y] == '-') {
                arr[x][y] = symbol;
                turns++;
                isWin = winner(arr, symbol);

                printTable(arr);

                if (isWin) {
                    System.out.println("Ο παίκτης με το " + symbol + " κέρδισε");
                } else if (turns == 9) {
                    System.out.println("Το παιχνίδι τελείωσε. Ισοπαλία");
                }

                if (symbol == 'X') {
                    symbol = 'O';
                } else {
                    symbol = 'X';
                }
            } else {
                System.out.println("Δώσε άλλες συντεταγμένες που είναι κενές.");
            }
        }

    }

    //Αρχικοποίηση του πίνακα
    public static void initialValueArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '-';
            }
        }
    }

    // Μέθοδος για την ανάγνωση του συμβόλου του παίκτη
    public static char readPlayerSymbol(Scanner in) {
        char symbol = ' ';
        while (symbol != 'X' && symbol != 'O') {
            String input = in.nextLine().toUpperCase();
            if (input.length() == 1) {
                symbol = input.charAt(0); //μετατροπή πρώτου χαρακτήρα String σε char
                if (symbol != 'X' && symbol != 'O' ) {
                    System.out.println("Μη έγκυρο σύμβολο! Διάλεξε σύμβολο 'X' ή 'O': ");
                }
            }else {
                System.out.println("Το σύμβολο δεν περιέχει μόνο έναν χαρακτήρα. Διάλεξε σύμβολο 'X' ή 'O':");
            }
        }
        return symbol;
    }


    // Μέθοδος για έγκυρη είσοδο τιμής της γραμμής του χρήστη
    public static int getValidInputX(Scanner in) {
        int num;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num >= 0 && num <= 2) {
                    return num;
                } else {
                    System.out.println("Σφάλμα! Ο αριθμός πρέπει να είναι στο εύρος 0-2.");
                }
            } else {
                System.out.println("Σφάλμα! Δεν είναι ακέραιος αριθμός.");
                in.next();
            }
            System.out.print("Δώσε ξανά έναν ακέραιο αριθμό 0-2 για τη γραμμή: ");
        }
    }

    // Μέθοδος για έγκυρη είσοδο τιμής της γραμμής του χρήστη
    public static int getValidInputΥ(Scanner in) {
        int num;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num >= 0 && num <= 2) {
                    return num;
                } else {
                    System.out.println("Σφάλμα! Ο αριθμός πρέπει να είναι στο εύρος 0-2.");
                }
            } else {
                System.out.println("Σφάλμα! Δεν είναι ακέραιος αριθμός.");
                in.next();
            }
            System.out.print("Δώσε ξανά έναν ακέραιο αριθμό 0-2 για τη στήλη: ");
        }
    }

    //Μέθοδος για εκτύπωση του πίνακα
    public static void printTable(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Μέδοθος για έλεγχο αν κέρδισε κάποιος
    public static boolean winner(char[][] arr, char symbol) {
        //για γραμμή
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == symbol && arr[i][1] == symbol && arr[i][2] == symbol) {
                return true;
            }
        }

        //για στήλη
        for (int i = 0; i < arr.length; i++) {
            if (arr[0][i] == symbol && arr[1][i] == symbol && arr[1][i] == symbol) {
                return true;
            }
        }

        //για διαγώνιους
        if (arr[0][0] == symbol && arr[1][1] == symbol && arr[2][2] == symbol) {
            return true;
        }

        if (arr[0][2] == symbol && arr[1][1] == symbol && arr[2][0] == symbol) {
            return true;
        }

        return false;
    }

}

